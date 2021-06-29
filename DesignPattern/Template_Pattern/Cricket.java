package DesignPattern.Template_Pattern;

public class Cricket extends Game{
    @Override
    public void start(){
        System.out.println("Cricket started");
    }

    @Override
    public void running(){
        System.out.println("Cricket Running");
    }

    @Override
    public void end(){
        System.out.println("Cricket Ended");
    }
}