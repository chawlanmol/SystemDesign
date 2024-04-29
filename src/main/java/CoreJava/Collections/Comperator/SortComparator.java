package CoreJava.Collections.Comperator;

import java.util.Comparator;
import java.util.HashMap;

public class SortComparator implements Comparator<Integer> {
    private HashMap<Integer , Integer> hashMap = new HashMap<>();

    public SortComparator(HashMap<Integer , Integer> hashMap) {
        this.hashMap = hashMap;
    }


    @Override
    public int compare(Integer a, Integer b) {
        int f =  hashMap.get(b).compareTo(hashMap.get(a));
        int v = a.compareTo(b);

        if(f == 0) return v;
        return f;
    }
}
