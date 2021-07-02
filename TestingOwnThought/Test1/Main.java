package TestingOwnThought.Test1;

public class Main {
    public static void main(String[] args) {
        TestCodinator test = new TestCodinator();

        test.execute();
        test.whichState();

        TestCodinator test1 = new Test1();
        test1.whichState();
    }
}
