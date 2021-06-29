package DesignPattern.Template_Pattern;

abstract class Game {
    abstract void start();
    abstract void running();
    abstract void end();

    public void play(){
        start();

        running();

        end();
    }
}