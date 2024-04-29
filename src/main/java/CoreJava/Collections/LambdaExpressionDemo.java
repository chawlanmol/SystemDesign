package CoreJava.Collections;

import java.util.HashSet;

public class LambdaExpressionDemo {


    /**
     * using lambda we can just pass the implementation
     */
    public void show() {

        FunctionalInterface object2 = () -> {
            System.out.println("showing how to use the lambda expression");
        };
        HashSet<Integer> hashSet = new HashSet<>();


        FunctionalInterface object3 = () -> System.out.println("showing use of lambda");
    }
}
