package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.Interface.IObservable;
import DesignPatterns.ObserverPattern.Interface.IObserver;
import DesignPatterns.ObserverPattern.ProductNotification.IphoneNotifier;
import DesignPatterns.ObserverPattern.ProductNotification.MobileAlertImpl;

public class ObserverStoreDemo {

    public void Demo() {

        IObservable iphoneNotifier = new IphoneNotifier();
        IObserver mobileAlert = new MobileAlertImpl(iphoneNotifier);
        iphoneNotifier.add(mobileAlert);
        iphoneNotifier.setStockCount(100);
    }
}
