package DesignPatterns.Decorator.PizzaDecorator;

public class SauceDecorator extends ToppingsDecorator {
    ToppingsDecorator toppingsDecorator;
    public SauceDecorator(BasePizza basePizza, ToppingsDecorator toppingsDecorator) {
        super(basePizza);
        this.toppingsDecorator = toppingsDecorator;
    }
    public Double getPrice(){
        return toppingsDecorator.getPrice() + 10;
    }
}
