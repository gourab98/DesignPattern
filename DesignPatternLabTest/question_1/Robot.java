package question_1;

public class Robot implements RobotState {

    private RobotState robotOn;
    private RobotState robotCook;
    private RobotState robotOff;

    private RobotState state;

    public Robot(){

        this.robotOn = new RobotOn(this);
        this.robotCook = new RobotCook(this);
        this.robotOff = new RobotOff(this);

        this.state = robotOn;
    }

    public void setRobotState(RobotState state){
        this.state = state;
    }

    @Override
    public void walk() {
        state.walk();
    }

    @Override
    public void cook() {
        state.cook();

    }

    @Override
    public void off() {
        state.off();
    }

    public RobotState getRobotOn() {
        return robotOn;
    }

    public void setRobotOn(RobotState robotOn) {
        this.robotOn = robotOn;
    }

    public RobotState getRobotCook() {
        return robotCook;
    }

    public void setRobotCook(RobotState robotCook) {
        this.robotCook = robotCook;
    }

    public RobotState getRobotOff() {
        return robotOff;
    }

    public void setRobotOff(RobotState robotOff) {
        this.robotOff = robotOff;
    }

    public RobotState getState() {
        return state;
    }

    public void setState(RobotState state) {
        this.state = state;
    }
}
