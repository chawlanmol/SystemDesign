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
     * We can use parellal stream to do somce multithreading
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



}
