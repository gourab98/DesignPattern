package DesignPattern.Decorator_Pattern;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();
}