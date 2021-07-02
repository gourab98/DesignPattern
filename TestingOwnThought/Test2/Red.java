package TestingOwnThought.Test2;

public class Red implements State {

    TrafficSystem  trafficSystem;

    public Red(TrafficSystem trafficSystem) {
        this.trafficSystem = trafficSystem;
    }

    @Override
    public void onGreenLight() {
        System.out.println("RedTest Green is coming soon.");
        trafficSystem.setState(trafficSystem.getGreenState());
    }

    @Override
    public void onYellowLight() {
        System.out.println("RedTest Can't go to directly Red to Yellow");
    }

    @Override
    public void onRedLight() {
        System.out.println("Red is On");
    }
}
