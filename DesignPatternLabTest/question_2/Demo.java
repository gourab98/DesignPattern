package DesignPatternLabTest.question_2;

// Using Decorator Pattern

public class Demo {
    public static void main(String[] args) {

        Beverage beverage1 = new Cappuccino();

        beverage1 = new Milk(beverage1);
        beverage1 = new Milk(beverage1);
        beverage1 = new Sugar(beverage1);

        System.out.println(beverage1.getDescription() + " total Cost " + beverage1.cost() +" tk\n");

        Beverage beverage2 = new DarkRoast();

        System.out.println(beverage2.getDescription() + " total Cost " + beverage2.cost()+ " tk \n");

        Beverage beverage3 = new Espresso();

        beverage3 = new Milk(beverage3);
        beverage3 = new Sugar(beverage3);

        System.out.println(beverage3.getDescription() + " total Cost " + beverage3.cost()+ " tk\n");


    }
}
