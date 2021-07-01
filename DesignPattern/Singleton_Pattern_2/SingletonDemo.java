package DesignPattern.Singleton_Pattern_2;

public class SingletonDemo {

    public static void main(String[] args) {
        Singleton objOne = Singleton.getInstance();
        Singleton objTwo = Singleton.getInstance();

        if(objOne == objTwo){
            System.out.println("They are just same objects.");
        }
    }
}
