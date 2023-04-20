package DesignPatterns.BuilderPattern;

public class Dog {
    private String name;
    private String breed;
    private String gender;
    private Integer price;

    public Dog(DogBuilder dogBuilder) {
        this.breed = dogBuilder.breed;
        this.gender = dogBuilder.gender;
        this.name = dogBuilder.name;
        this.price = dogBuilder.price;
    }

    public void PrintDog() {
        System.out.println("Dog Name :" + name);
        System.out.println("Dog Breed :" + breed);
        System.out.println("Dog gender :" + gender);
        System.out.println("Dog price :" + price);
    }


    public static class DogBuilder {
        private String name;
        private String breed;
        private String gender;
        private Integer price;

        public DogBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public DogBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public DogBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public DogBuilder setPrice(Integer price) {
            this.price = price;
            return this;
        }
        public Dog  build() {
            Dog dog = new Dog(this );
            return dog;
        }
    }
}
