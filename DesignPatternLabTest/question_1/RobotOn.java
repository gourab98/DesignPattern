package question_1;

public class RobotOn implements RobotState {

    private final Robot robot;

    public RobotOn(Robot robot){
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Robot is walking now.");
    }

    @Override
    public void cook() {
        System.out.println("Robot is cooking now.");
        robot.setRobotState(robot.getRobotCook());
    }

    @Override
    public void off() {
        robot.setState(robot.getRobotOff());
        System.out.println("Robot is switched off.");

    }
}
