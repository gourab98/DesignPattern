package DesignPatternLabTest.question_2;

public class Espresso extends Beverage{
    public Espresso() {

        description = "Espresso Coffee";

    }
    @Override
    public double cost() {

        return 150;

    }
}