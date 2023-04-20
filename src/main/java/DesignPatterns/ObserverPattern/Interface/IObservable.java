package DesignPatterns.ObserverPattern.Interface;

public interface IObservable {

    void add(IObserver o);
    void remove(IObserver o);
    void notifyAllObserver();
    void setStockCount(Integer count);
    Integer getStockCount();
}
