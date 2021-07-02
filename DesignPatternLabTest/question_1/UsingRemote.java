package DesignPatternLabTest.question_1;

// Using Command Pattern

public class UsingRemote {

    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.cook();
        robot.walk();
        robot.off();
        robot.walk();
        robot.off();
        robot.cook();
        robot.walk();
        robot.cook();
        robot.off();
        robot.walk();
        robot.off();

    }
}
