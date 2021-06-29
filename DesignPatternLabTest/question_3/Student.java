package question_3;

public class Student extends SimulationGame{

    @Override
    void start() {
        System.out.println("Student starts the game.");
    }

    @Override
    void playing() {
        System.out.println("Student is playing the game.");
    }

    @Override
    void end() {
        System.out.println("Student's game end.");
    }
}
