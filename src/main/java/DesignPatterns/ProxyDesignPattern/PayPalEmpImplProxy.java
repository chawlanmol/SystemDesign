package DesignPatterns.ProxyDesignPattern;

import Utilities.LoggerUtil;

public class PayPalEmpImplProxy implements IEmployee{
    PayPalEmpImpl payPalEmp;

    public PayPalEmpImplProxy() {
        this.payPalEmp = new PayPalEmpImpl();
    }

    @Override
    public void createEmp() {
        payPalEmp.createEmp();
    }

    @Override
    public void getEmp(Integer employeeId) {
        if(employeeId > 0) {
            payPalEmp.getEmp(employeeId);
        } else {
            LoggerUtil.log("invalid ID");
        }
    }
}
