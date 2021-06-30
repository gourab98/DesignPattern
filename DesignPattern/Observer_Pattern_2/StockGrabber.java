package DesignPattern.Observer_Pattern_2;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList <Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
    observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
    int observerIndex = observers.lastIndexOf(deleteObserver);

        System.out.println("Observer "+(observerIndex+1)+" is deleted.");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
    for(Observer observer: observers){
        observer.update(ibmPrice,aaplPrice,googPrice);
    }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
