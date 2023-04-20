package Problems.LRU;

public interface ICache {
    Integer get(Integer key);
    void put(Integer key , Integer value);
}
