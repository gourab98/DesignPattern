package TestingOwnThought.Test2;

public class TrafficSystem {

    State green;
    State yellow;
    State red;

    State state;

    public TrafficSystem() {
        green = new Green(TrafficSystem.this);
        yellow = new Yellow(TrafficSystem.this);
        red = new Red(TrafficSystem.this);

        this.state = green;
    }

    public void turnTheGreenLightOn(){
        state.onGreenLight();
    }

    public void turnTheYellowLightOn(){
        state.onYellowLight();
    }
    public void turnTheRedLightOn(){
        state.onRedLight();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getGreenState(){return green;}
    public State getYellowState(){return yellow;}
    public State getRedState(){return red;}
}
