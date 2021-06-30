package DesignPattern.Strategy_Pattern_2;

public class DuckPlay {

    public static void main(String[] args) {

        Duck hill = new Duck(new HillFly());
        Duck sky = new Duck(new SkyFly());

        hill.flytype();
        sky.flytype();


    }


}
