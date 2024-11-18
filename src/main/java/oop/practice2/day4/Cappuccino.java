package oop.practice2.day4;

public class Cappuccino extends Coffee {
    protected final int mlOfMilk;
    private static final String coffee = "Cappuccino";

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity);
        this.mlOfMilk = mlOfMilk;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println(coffee + " milk: " + mlOfMilk + " ml");
    }

    protected void make(){
        super.make();
        System.out.println("Adding " + mlOfMilk + " mls of milk");

    }

    public final Cappuccino makeCappuccino() {
        System.out.println("\nMaking " + coffee);
        make();
        return this;
    }
}
