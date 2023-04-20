package DesignPatterns.Adapter;

public class AdapterPatternDemo {
    public void  Demo() {
        Bird bird = new Parrot();
        Duck duckAdapter = new AdapterPattern(bird);
        duckAdapter.Quack();
    }
}
