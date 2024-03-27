package DesignPatterns.paymentGateway.PaymentStrategy;

import DesignPatterns.paymentGateway.enums.PaymentModes;

public class PaymentStrategy {

    PaymentModes paymentModes;
    public PaymentStrategy(PaymentModes paymentModes) {
        this.paymentModes = paymentModes;
    }
}
