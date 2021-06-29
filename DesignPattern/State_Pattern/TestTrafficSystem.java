package DesignPattern.State_Pattern;

public class TestTrafficSystem {
    public static void main(String[] args) {
        TrafficSystem trafficSystem = new TrafficSystem();

        trafficSystem.turnOnGreenLight();
        trafficSystem.turnOnRedLight();

        trafficSystem.turnOnYellowLight();
        trafficSystem.turnOnGreenLight();

        trafficSystem.turnOnRedLight();
        trafficSystem.turnOnYellowLight();
        trafficSystem.turnOnGreenLight();
    }
}