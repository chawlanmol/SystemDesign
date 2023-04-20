package DesignPatterns.Decorator.PizzaDecorator;

public class DecoratorDemo {

    public void Demo (){
        Margherita pizza = new Margherita();
        pizza.setPrice(10.0);
        CheeseToppings cheesePizza = new CheeseToppings(pizza);
        cheesePizza.setPrice(20.0);
        Double price = cheesePizza.getPrice();
        SauceDecorator sauceDecorator = new SauceDecorator(pizza, cheesePizza);
        price = sauceDecorator.getPrice();
        System.out.println(price);
    }
}
