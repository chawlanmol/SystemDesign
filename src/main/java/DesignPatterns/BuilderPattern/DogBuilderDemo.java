package DesignPatterns.BuilderPattern;

public class DogBuilderDemo {

    public void Demo() {
        Dog dog = new Dog.DogBuilder().
                setBreed("German").
                setName("kutta").
                setPrice(100).
                setGender("MALE").
                build();


    }
}
