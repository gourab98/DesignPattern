package DesignPattern.Observer_Pattern_2;

public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
