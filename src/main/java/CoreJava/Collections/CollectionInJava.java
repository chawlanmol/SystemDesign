package CoreJava.Collections;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * Collection framework was added in java 1.2
 * Collection is group of objects -> array
 *
 * present in java.util
 */


/**
 * Main Interface Iteratable -> Collection -> [List , Set , Queue]
 * List -> link List , ArrayList
 *
 * Set -> HashSet , TreeSet , LinkedhashSet
 */

/**
 * Collection -> map (parent is not Iteratable)
 *
 * Map -> hashtabel , hashMap , LinkedhashMap
 *
 * HashMap
 * HashTable is synchronised
 * LinkedHashMap maintains the insertion order
 */
public class CollectionInJava {

    public void Demo() {

            int array [] = new int[1000];
            checkSet();
    }


    public void listDemo() {

        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerList2 = new LinkedList<>();
        List<Integer> integerList3 = new Vector<>();
     }

    public void vectorDemo() {

        Vector<Integer> v = new Vector<>();

        // read
        v.add(1);

        // write
        v.get(0);

        int a []  = new int[10];
        a[0] = 0;

        // get --> a[0]



    }

    public class Node{
        int val;
        Node next;

        public Node(int val , Node next) {
            this.val = val;
            this.next = null;
        }


    }


    public void populateHasMap() {

        HashMap<Node , Node> parentMap = new HashMap<>();

        Node parent = new Node(2 , null);

        Node child = new Node(1, parent);

        parentMap.put(child, parent);

        if(parentMap.containsKey(child)) {
            System.out.println("child exist in parent");
        }

        if(parentMap.containsKey(parent)) {
            System.out.println("parent exist in map");
        }

    }

    /**
     * hashmap gives O(1) performance for get and put
     * HashMap vs  HashTable vs LinkedHashMap
     * HashTable is Synchronized
     *
     *
     */

    public void checkHashTable() {

        // this is synchronised

        Map<Integer , Integer> newMap = new Hashtable<>();


        // non synchronised
        // cap 16 , load factor .75
        Map<Integer , Integer> newMap2 = new HashMap<>();


        // maintain insertion order
        // combination of hashset and linklist
        // this can keep null key and values
        Map<Integer , Integer> newMap3 = new LinkedHashMap<>();


        // this keeps synchronised along with concurrency
        // this only locks a  block of the hashtable not the whole table
        // performance optimised for multithreading operation
        Map<Integer , Integer> newMap4 = new ConcurrentHashMap<>();


    }


    /**
     * set Does not contain duplicate element
     * can not have index value, hash Set has no order
     *
     * TreeSet is a sorted Set
     */

    public void checkSet() {


        // this is not sorted

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(7);
        set.add(4);
        set.add(64);
        set.add(31);

        // this keeps the values in sorted order
        Set<Integer> set1 = new TreeSet<>();

        set1.add(1);
        set1.add(7);
        set1.add(4);
        set1.add(64);
        set1.add(31);

        for(Integer a : set1) {
            System.out.println(a);
        }
    }

    Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1%10 < o2%10) return 1;
            else return -1;
        }
    };


    public void sortListUsingComparator() {


        List<Integer> nums = Arrays.asList(1, 7 ,41 , 9 , 0 , -3);

        Collections.sort(nums , comparator);

        nums.forEach(a -> System.out.println(a));

    }
}
