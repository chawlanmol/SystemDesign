package DesignPatterns.Decorator.PizzaDecorator;

public class ToppingsDecorator extends BasePizza {

    BasePizza basePizza;

    ToppingsDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public Double getPrice() {
        return this.price + basePizza.getPrice();
    }


}
