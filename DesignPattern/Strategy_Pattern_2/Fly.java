package DesignPattern.Strategy_Pattern_2;

public interface Fly {

    public String fly();

}

class HillFly implements Fly{
    @Override
    public String fly() {
        System.out.println("Flying in the hill.");
        return null;
    }
}
class SkyFly implements Fly{
    public String fly() {
        System.out.println("Flying in the sky.");
        return null;
    }

}