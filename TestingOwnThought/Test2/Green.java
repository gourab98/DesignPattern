package TestingOwnThought.Test2;

public class Green implements State{
    TrafficSystem trafficSystem;

    public Green(TrafficSystem trafficSystem) {
        this.trafficSystem = trafficSystem;
    }

    @Override
    public void onGreenLight() {
        System.out.println("Green On.");
    }

    @Override
    public void onYellowLight() {
        System.out.println("GreenTest Move carefully.");
        trafficSystem.setState(trafficSystem.getYellowState());

    }

    @Override
    public void onRedLight() {
        System.out.println("GreenTest Can't go directly from Green to Red.");
    }
}
