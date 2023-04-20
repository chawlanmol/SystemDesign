package DesignPatterns.ObserverPattern.ProductNotification;

import DesignPatterns.ObserverPattern.Interface.IObservable;
import DesignPatterns.ObserverPattern.Interface.IObserver;

import java.util.LinkedList;
import java.util.List;

public class IphoneNotifier implements IObservable {
    List<IObserver>  observers = new LinkedList<>();
    Integer stockCount;
    @Override
    public void add(IObserver o) {
        if(o != null) observers.add(o);
    }

    @Override
    public void remove(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllObserver() {
        observers.stream().forEach(o -> o.update());
    }

    @Override
    public void setStockCount(Integer count) {
        this.stockCount = count;
        notifyAllObserver();
    }

    @Override
    public Integer getStockCount() {
        return stockCount;
    }
}
