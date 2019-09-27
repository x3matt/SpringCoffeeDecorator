package entities;

public class Milk extends Decorator {

    public Milk(Coffee newCoffee) {
        super(newCoffee);
        System.out.println("Adding Milk");
    }
    public String getDescription() {
        return tempCoffee.getDescription()+", Milk";
    }
    public double getCost() {
        return tempCoffee.getCost()+.50;
    }
}
