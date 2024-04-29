package CoreJava.Collections.Comperator;


import lombok.Data;

/**
 * Comparable has to be inside the same class
 *
 * Comparable vs Comparator
 *
 */
@Data
public class Car implements Comparable<Car>{
    public Car(Integer price) {
        this.price = price;
    }

    Integer price;

    @Override
    public int compareTo(Car o2) {
        return this.getPrice().compareTo(o2.getPrice());
    }
}
