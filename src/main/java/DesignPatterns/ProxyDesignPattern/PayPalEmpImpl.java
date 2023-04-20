package DesignPatterns.ProxyDesignPattern;

import Utilities.LoggerUtil;

public class PayPalEmpImpl implements IEmployee {

    @Override
    public void createEmp() {
        LoggerUtil.log("Creating  a new Employee");
    }

    @Override
    public void getEmp(Integer employeeId) {
        LoggerUtil.log("getting a new Employee" + employeeId);

    }
}
