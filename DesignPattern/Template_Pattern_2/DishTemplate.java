package DesignPattern.Template_Pattern_2;

public abstract class DishTemplate {

    public abstract void addSauce();
    public abstract void addProtein();
    public abstract void garnishThePlate();

    final void prepareTheRecipe() {
        boilWater();
        cook();
        addSauce();
        addProtein();
        garnishThePlate();
    }

    public void boilWater() {
        System.out.println("Water is boiling.");
    }

    public void cook() {
        System.out.println("DishTemplate is cooking.");
    }
}