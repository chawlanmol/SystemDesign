package Problems.LRU;

public class LRUDemo {

    public void Demo(){
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1,10);
        lruCache.put(2,11);
        lruCache.put(3,12);
        lruCache.put(4, 15);
        lruCache.printDLL();
        System.out.println(lruCache.get(1));
    }
}
