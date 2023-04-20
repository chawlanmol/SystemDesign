package Problems.DesignHashMap;

public class HashMapDemo {

    public void Demo() {
        HashMap hashMap = new HashMap();
        hashMap.put(4 ,5);
        hashMap.put(68, 4);
        hashMap.put(3, 2);
        hashMap.put(1, 1);
        hashMap.put(1, 4);

        System.out.println(hashMap.get(4));
        System.out.println(hashMap.get(3));
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(68));


    }
}
