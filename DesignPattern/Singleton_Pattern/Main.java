package DesignPattern.Singleton_Pattern;


public class Main {

    public static void main(String[] args) {

        Database db1 = Database.getInstance();
        db1.update();

        Database db2 = Database.getInstance();
        db2.update();

    }
}