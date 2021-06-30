package DesignPattern.Strategy_Pattern_2;

public class Duck {

    Fly flyingtype;
    private String name;

    public Duck(Fly flyingtype) {
        this.flyingtype = flyingtype;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String flytype(){
        return flyingtype.fly();
    }


}
