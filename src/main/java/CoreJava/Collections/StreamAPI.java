package CoreJava.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {


    /**
     *  We can not read a stream twice
     *  Once Reading the stream , stream gets closed
     *
     * We can use parellal stream to do some multithreading
     */


    public void streamAPIDemoChangeArray(){

        List<Integer> nums = Arrays.asList(1,3,5,6);

        Stream<Integer> data = nums.stream();


        // Steam can only be used once
        // if we use stream again it throws a error.
        data.forEach(a -> System.out.println(a*2));

    }


    public void streamAPIDemo2ThrowExceptionStreamConsumed(){

        List<Integer> nums = Arrays.asList(1,3,5,6);

        Stream<Integer> data = nums.stream();

        long count = data.count();

        System.out.println(count);

        // Steam can only be used once
        // if we use stream again it throws a error.
        data.forEach(a -> System.out.println(a*2));

    }

    public void streamAPIDemo3(){

        List<Integer> nums = Arrays.asList(6,3,5,6);

        Stream<Integer> data = nums.stream();


        // sorting gives new stream
        Stream<Integer> data2 = data.sorted();

        // Steam can only be used once
        // if we use stream again it throws a error.
        data2.forEach(a -> System.out.println(a*2));

    }


    /**
     * applying a map on stream API
     *
     * Filter return true or false for Predicate.
     */
    public void streamAPIDemo4(){

        List<Integer> nums = Arrays.asList(4,3,8,1);

      Set<Integer> set = nums.stream()
                .filter(n -> n%2 == 1)
                .map(a -> a*2).collect(Collectors.toSet());

        set.forEach(a -> System.out.println(a));
    }

    /**
     * merging two array
     * and then removing duplicates and then sorting using stream
     *
     */
    public void removeDuplicatesUsingStreamApi() {

        List<Integer> nums = Arrays.asList(1 , 3 , 4 , 4 , 6 , 7);

        List<Integer> nums2 = Arrays.asList(1 , 1 , 7 , 6, 42 , 21);


        List<Integer> nums3 = Stream
                .concat(nums2.stream() , nums.stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        nums3.forEach(i -> System.out.println(i));

    }

    /**
     * merging two array
     * and then removing duplicates and then sorting using stream
     *
     */
    public void convertStringListToInteger() {

        List<String> stringList = Arrays.asList("1" , "2" , "3" , "4", "1234569");

        List<Integer> integerList = stringList.stream().map(a ->  Integer.parseInt(a)).collect(Collectors.toList());

        integerList.stream().forEach(a -> System.out.println(a));

    }



}
