package DesignPatterns.Adapter;

public class AdapterPattern implements Duck {
    Bird bird;

    public AdapterPattern(Bird bird) {
        this.bird = bird;
    }

    public void Quack() {
        bird.chirp();
    }
}
