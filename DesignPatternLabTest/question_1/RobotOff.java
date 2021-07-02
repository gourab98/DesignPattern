package DesignPatternLabTest.question_1;

public class RobotOff implements RobotState {
    private final Robot robot;

    public RobotOff(Robot robot){
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Robot is walking now.");
        robot.setRobotState(robot.getRobotOn());
    }

    @Override
    public void cook() {
        System.out.println("Robot can't cook at off state.");
    }

    @Override
    public void off() {
        System.out.println("Already switched off.");
    }
}
