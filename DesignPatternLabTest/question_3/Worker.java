package question_3;

public class Worker extends SimulationGame {
    @Override
    void start() {
        System.out.println("Worker starts the game.");
    }

    @Override
    void playing() {
        System.out.println("Worker is playing the game.");
    }

    @Override
    void end() {
        System.out.println("Worker's game end.");
    }
}
