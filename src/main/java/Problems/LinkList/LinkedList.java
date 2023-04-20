package Problems.LinkList;

public class LinkedList {
    DLLNode head;
    DLLNode tail;

    public LinkedList() {
         head = new DLLNode(-1,-1);
         tail = new DLLNode(-1,-1);
         head.next = tail;
         tail.prev = head;
         head.prev = null;
         tail.next = null;
    }

    public void addNode(DLLNode newNode) {
        DLLNode tmp = head.next;
        head.next = newNode;
        newNode.prev = head;
        newNode.next = tmp;
        tmp.prev = newNode;
    }

    public void deleteNode(DLLNode node) {
        if(node == head) {
            head = null;
            return;
        }
        node.prev.next = node.next;
        if(node.next != null) node.next.prev = node.prev;
    }
    public  void printList() {
        DLLNode tmp = head.next;
        while (tmp != tail) {
            System.out.println(tmp.key + "*" +tmp.value);
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void removelast() {
        if(tail.prev != head) tail = tail.prev;
        tail.next = null;
        tail.key = -1;
        tail.value = -1;
    }

    public DLLNode getLast(){
        if(tail.prev != head) return tail.prev;
        return  null;
    }
}
