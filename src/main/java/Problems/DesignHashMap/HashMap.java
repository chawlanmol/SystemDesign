package Problems.DesignHashMap;

public class HashMap<K,V> {

    public Node[] nodes = new Node[64];

    public  HashMap() {
    }

    public int getHash(K key) {
        return key.hashCode() % 64;
    }

    public V get(K key)  {
        int hash = getHash(key);
        if(nodes[hash] == null) {
            return null;
        }

        Node tmp = nodes[hash];

        while(tmp != null) {
            if(tmp.key == key) return (V) tmp.value;
            tmp = tmp.next;
        }
        return null;
    }
    public void put(K key, V value) {
        int hash = getHash(key);
        if(nodes[hash] == null) {
            nodes[hash] = new Node(key, value);
            nodes[hash].next = null;
        } else {

            Node tmp = nodes[hash];
            Node prev = tmp;
            while (tmp != null) {
                if(tmp.key == key) {
                    tmp.value = value;
                    return;
                }
                prev = tmp;
                tmp = tmp.next;
            }
            prev.next = new Node(key, value);
            prev.next.next = null;

        }
    }
}
