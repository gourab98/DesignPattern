package DesignPattern.Factory_Pattern;

public class FactoryDemo {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
        pizzaStore.orderPizza("Calm");
    }
}
