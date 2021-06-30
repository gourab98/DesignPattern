package DesignPattern.Observer_Pattern;

public class Client implements Listener{

    @Override
    public void notification(){
        System.out.println("Client notification.");
    }
}
