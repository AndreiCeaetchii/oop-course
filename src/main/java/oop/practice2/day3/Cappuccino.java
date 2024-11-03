package oop.practice2.day3;

public class Cappuccino extends Coffee {
    protected final int mlOfMilk;
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

    public Cappuccino makeCappuccino() {
        System.out.println("\nMaking " + coffee);
        System.out.println("Intensity set to " + this.getIntensity());
        System.out.println("Adding " + mlOfMilk + " mls of milk");
        return this;
    }
}
