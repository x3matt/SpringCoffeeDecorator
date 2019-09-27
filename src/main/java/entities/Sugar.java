package entities;

public class Sugar extends Decorator {

    public Sugar(Coffee newCoffee) {
        super(newCoffee);
        System.out.println("Adding Sugar");
    }
    public String getDescription() {
        return tempCoffee.getDescription()+", Sugar";
    }
    public double getCost() {
        return tempCoffee.getCost()+.15;
    }
}