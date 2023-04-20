package Problems.LinkList;

public class DLLNode {
   public Integer key , value;
   public DLLNode prev , next;
    public DLLNode(Integer key , Integer value) {
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
