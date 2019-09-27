package entities;

abstract class Decorator implements Coffee {

    protected Coffee tempCoffee;

    public Decorator(Coffee newCoffee) {
        tempCoffee=newCoffee;
    }

    public String getDescription() {
        return tempCoffee.getDescription();
    }

    public double getCost() {
        return tempCoffee.getCost();
    }

}
