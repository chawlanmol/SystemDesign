package DesignPatterns.Decorator.PizzaDecorator;

public class CheeseToppings extends ToppingsDecorator {
    public CheeseToppings(BasePizza basePizza) {
        super(basePizza);
    }
}
