package oop.practice2.day2;

public class Cappuccino extends Coffee {
    private final int mlOfMilk;
    private static final String coffee = "Capuccino";

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity);
        this.mlOfMilk = mlOfMilk;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println(coffee + " milk: " + mlOfMilk + " ml");
    }
}
