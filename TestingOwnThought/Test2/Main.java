package TestingOwnThought.Test2;

public class Main {
    public static void main(String[] args) {
        TrafficSystem trafficSystem = new TrafficSystem();

        System.out.println(trafficSystem.state);
        trafficSystem.turnTheGreenLightOn();
        System.out.println(trafficSystem.state);
        trafficSystem.turnTheYellowLightOn();
        trafficSystem.turnTheYellowLightOn();
        System.out.println(trafficSystem.state);
        trafficSystem.turnTheRedLightOn();
        trafficSystem.turnTheRedLightOn();
        System.out.println(trafficSystem.state);
        trafficSystem.turnTheGreenLightOn();
        System.out.println(trafficSystem.state);
        trafficSystem.turnTheYellowLightOn();



    }
}
