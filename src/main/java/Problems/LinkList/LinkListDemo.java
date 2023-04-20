package Problems.LinkList;

public class LinkListDemo {

    public void Demo() {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(new DLLNode(1, 2));
        linkedList.addNode(new DLLNode(4, 5));
        linkedList.addNode(new DLLNode(1, 2));
        linkedList.addNode(new DLLNode(4, 5));
        linkedList.addNode(new DLLNode(1, 2));
        DLLNode deleteNode = new DLLNode(4, 5);
        linkedList.addNode(deleteNode);
        linkedList.printList();
        linkedList.deleteNode(deleteNode);
        linkedList.printList();
    }
}
