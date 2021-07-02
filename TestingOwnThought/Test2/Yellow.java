package TestingOwnThought.Test2;

public class Yellow implements State {

    TrafficSystem trafficSystem;

    public Yellow(TrafficSystem trafficSystem) {
        this.trafficSystem = trafficSystem;
    }

    @Override
    public void onGreenLight() {
        System.out.println("YellowTest can't go directly from Yellow to Green");
    }

    @Override
    public void onYellowLight() {
        System.out.println("Yellow On.");
    }

    @Override
    public void onRedLight() {
        System.out.println("YellowTest Red Light is coming soon");
        trafficSystem.setState(trafficSystem.getRedState());
    }
}
