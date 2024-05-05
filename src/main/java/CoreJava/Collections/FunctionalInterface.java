package CoreJava.Collections;

@java.lang.FunctionalInterface

/**
 * Functional Interface can only have one function interface
 */
public interface FunctionalInterface {

    void show();

    default void show(int a) {
        System.out.println(a);
    }

}
