package entities;

public class Cappuccino extends Decorator {

    public Cappuccino(Coffee newCoffee) {
        super(newCoffee);
    }
    public String getDescription() {
        return tempCoffee.getDescription();
    }
    public double getCost() {
        return tempCoffee.getCost();
    }
}