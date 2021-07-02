package DesignPattern.Template_Pattern_2;

public class Spaghetti extends DishTemplate {

    public void addSauce() {
        System.out.println("Tomato source is adding.");
    }
    public void addProtein() {
        System.out.println("Meatballs is adding.");
    }
     public void garnishThePlate() {
        System.out.println("Garnishing the plate.");
    }
}
