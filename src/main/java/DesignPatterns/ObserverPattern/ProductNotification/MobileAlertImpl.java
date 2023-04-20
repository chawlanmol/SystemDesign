package DesignPatterns.ObserverPattern.ProductNotification;

import DesignPatterns.ObserverPattern.Interface.IObservable;
import DesignPatterns.ObserverPattern.Interface.IObserver;
import Utilities.LoggerUtil;

public class MobileAlertImpl implements IObserver {
    private IObservable observable;
    public  MobileAlertImpl(IObservable observable) {
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmails();
        System.out.println("product is in stock, stockCount:  " + observable.getStockCount());
    }

    public void sendEmails() {
        LoggerUtil.log("email sent to customer ");
    }
}
