package DesignPattern.Template_Pattern_2;

public class Main {

    public static void main(String[] args) {

        DishTemplate dishTemplate1 = new Spaghetti();
        dishTemplate1.prepareTheRecipe();

        DishTemplate dishTemplate2 = new PenneNoodles();
        dishTemplate2.prepareTheRecipe();
    }
}

