package entities;

public class BasicCoffee implements Coffee {

    public String getDescription() {
        System.out.println("Adding Basic Coffee");
        return "Basic Coffee";
    }

    public double getCost() {
        return 2.00;
    }

}
