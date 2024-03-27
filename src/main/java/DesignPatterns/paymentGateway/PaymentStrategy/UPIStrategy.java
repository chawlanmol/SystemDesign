package DesignPatterns.paymentGateway.PaymentStrategy;

import DesignPatterns.paymentGateway.enums.PaymentModes;

public class UPIStrategy extends PaymentStrategy {
    private String vpa;

    public UPIStrategy(String vpa) {
        super(PaymentModes.UPI);
        this.vpa = vpa;
    }
}
