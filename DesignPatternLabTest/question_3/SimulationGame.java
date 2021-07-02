package DesignPatternLabTest.question_3;

abstract class SimulationGame {
    abstract void start();
    abstract void playing();
    abstract void end();

    public void play(){

        start();

        playing();

        end();
    }
}
