package DesignPattern.Factory_Pattern;

public class PepperoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing PepperoniPizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking PepperoniPizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting PepperoniPizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing PepperoniPizza");
    }
}
