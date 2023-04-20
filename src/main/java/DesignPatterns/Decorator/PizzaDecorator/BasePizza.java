package DesignPatterns.Decorator.PizzaDecorator;

public class BasePizza {
    Double price;

    public void makePizza() {
        System.out.println("this is base Pizza");
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
         this.price = price;
    }

}
