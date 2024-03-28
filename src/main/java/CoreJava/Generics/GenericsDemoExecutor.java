package CoreJava.Generics;

public class GenericsDemoExecutor {

    public void Demo() {
        GenericsDemo<Integer> genericsDemo = new GenericsDemo<>(32);
        genericsDemo.printObject();
    }
}
