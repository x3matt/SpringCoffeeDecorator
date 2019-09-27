package entities;

public class BlackCoffee implements Coffee {

    public String getDescription() {
        System.out.println("Adding Black Coffee");
        return "Black Coffee";
    }

    public double getCost() {
        return 2.25;
    }
}
