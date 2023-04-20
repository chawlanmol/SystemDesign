package Problems.LRU;


import Problems.LinkList.DLLNode;
import Problems.LinkList.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache implements ICache {

    LinkedList linkedList;

    Integer capacity;

    Map<Integer , DLLNode> cacheHash;

    public LRUCache(Integer capacity) {
        linkedList = new LinkedList();
        cacheHash = new HashMap<>();
        this.capacity = capacity;
    }

    public Integer get(Integer key) {
        if(!cacheHash.containsKey(key)) return -1;
        DLLNode node  = cacheHash.get(key);
        Integer val = node.value;
        deleteNode(node);
        addFront(node);
        return val;
    }

    public void put(Integer key, Integer value) {
        int size = cacheHash.size();
        if(cacheHash.containsKey(key)) {
            DLLNode dllNode = cacheHash.get(key);
            deleteNode(dllNode);
        }
        DLLNode newNode = new DLLNode(key, value);
        addFront(newNode);
        if(size == capacity){
            cacheHash.remove(linkedList.getLast().key);
            linkedList.removelast();
        }
        cacheHash.put(key, newNode);
    }
    private void deleteNode(DLLNode dllNode) {
        linkedList.deleteNode(dllNode);

    }

    private void addFront(DLLNode dllNode) {
        linkedList.addNode(dllNode);
    }

    public void printDLL() {
        linkedList.printList();
    }

}
