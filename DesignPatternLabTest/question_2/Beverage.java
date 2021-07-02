package DesignPatternLabTest.question_2;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){

        return description;
    }

    public abstract double cost();

}