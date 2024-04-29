package CoreJava.Collections.Comperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class ComperatorDemo {

    public void demo() {
        Car car = new Car(100);
        Car car1 = new Car(1001);
        Car cars[] = new Car[2];
        cars[0] = car;
        cars[1] = car1;
        List<Car> carList = Arrays.asList(car1, car);
        Collections.sort(carList, (Car o1, Car o2) -> o2.getPrice().compareTo(o1.getPrice()));
        carList.stream().forEach(a -> System.out.println(a));

        // one way of creating Max priority Queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((Integer a, Integer b) -> b - a);

        priorityQueue.add(1);
        priorityQueue.add(2);

        //        priorityQueue.forEach(a -> System.out.println(a));


        // Sorting a integer List in reverse order,
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(-1);

        Collections.sort(integerList, (Integer a, Integer b) -> (b - a));

        //        integerList.forEach(a -> System.out.println(a));


        frequencySortUsingComparator();
    }

    private void frequencySortUsingComparator() {
        List<Integer> integerList = Arrays.asList(1 , 3 ,3 ,3 , 1, 2 ,2 , 4 , 1);
        HashMap<Integer , Integer> freq = new HashMap<>();
        integerList.forEach(a -> freq.put(a , freq.getOrDefault(a, 0) + 1));
        Collections.sort(integerList , (Integer a , Integer b) -> (
                freq.get(b) - freq.get(a) == 0 ? (b - a) : freq.get(b) - freq.get(a)));

        integerList.forEach(a -> System.out.println(a));
    }
}
