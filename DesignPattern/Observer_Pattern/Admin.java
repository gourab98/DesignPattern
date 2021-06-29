package DesignPattern.Observer_Pattern;

public class Admin implements Listener{
    @Override
    public void notification(){
        System.out.println("Admin notification");
    }
}