package DesignPattern.Template_Pattern;

public class Football extends Game{
    @Override
    public void start(){
        System.out.println("Football started");
    }

    @Override
    public void running(){
        System.out.println("Football Running");
    }

    @Override
    public void end(){
        System.out.println("Football Ended");
    }
}