package question_1;

public class RobotCook implements RobotState {

    private final Robot robot;

    public RobotCook(Robot robot){
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Robot is walking now.");
        robot.setRobotState(robot.getRobotOn());
    }

    @Override
    public void cook() {
        System.out.println("Robot is cooking now.");
    }

    @Override
    public void off() {
        System.out.println("Robot can't be switched off while at cooking state.");
    }
}
