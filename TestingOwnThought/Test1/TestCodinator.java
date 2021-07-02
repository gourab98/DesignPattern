package TestingOwnThought.Test1;

public class TestCodinator implements Interface, State{

    public void whichState(){
        System.out.println(State.state);
    }

    @Override
    public void execute() {

        System.out.println("who Am I?");
        Interface.whoAmI();
    }

}
