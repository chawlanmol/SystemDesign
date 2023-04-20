package DesignPatterns.ProxyDesignPattern;

public class ProxyPatternDemo {

    public void Demo() {
        PayPalEmpImplProxy payPalEmpImplProxy = new PayPalEmpImplProxy();
        payPalEmpImplProxy.createEmp();
        payPalEmpImplProxy.getEmp(-100);
    }
}
