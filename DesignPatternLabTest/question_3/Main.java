package DesignPatternLabTest.question_3;

// Using Template Pattern

public class Main {
    public static void main(String[] args) {

        SimulationGame student = new Student();
        student.play();

        System.out.println("");

        SimulationGame teacher = new Teacher();
        teacher.play();

        System.out.println("");

        SimulationGame worker = new Worker();
        worker.play();
    }
}
