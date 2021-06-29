package DesignPattern.Command_Pattern_2;

public class TVRemote {

    public static ElectronicDevice getDevice(){

        return new Television();

    }

}