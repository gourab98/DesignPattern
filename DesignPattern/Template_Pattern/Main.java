package DesignPattern.Template_Pattern;

public class Main {

    public static void main(String[] args) {

        Game cricket = new Cricket();
        cricket.play();

        System.out.println("");
        Game football = new Football();
        football.play();
    }
}