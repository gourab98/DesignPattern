package DesignPattern.Template_Pattern_2;

public class PenneNoodles extends DishTemplate {
    public void addSauce() {
        System.out.println("Alfredo sauce is adding.");
    }
    public void addProtein() {
        System.out.println("Chicken is adding.");
    }
    public void garnishThePlate() {
        System.out.println("Garnishing the plate.");
    }
}