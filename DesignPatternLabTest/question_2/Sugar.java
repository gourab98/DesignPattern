package question_2;

public class Sugar extends ItemDecorator{
    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    public double cost() {
        return 20 + beverage.cost();
    }
}
