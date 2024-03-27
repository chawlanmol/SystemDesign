package DesignPatterns.paymentGateway.Bank;

import DesignPatterns.paymentGateway.enums.PaymentModes;

import java.util.List;

public class Bank {

    List<PaymentModes> supportedPaymentModes;

    public boolean processPayment() {
        return true;
    }

    public boolean cancelPayment() {
        return true;
    }

    public void addPaymentMode(PaymentModes paymentModes) {
        supportedPaymentModes.add(paymentModes);
    }
}
