package oop.practice2.day3;


public class PumpkinSpiceLatte extends Cappuccino {
    private int mgOfPumpkinSpice;
    private final String name = "PumpkinSpiceLatte";

    public PumpkinSpiceLatte(Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(intensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println(name + " Pumpkin Spice: " + mgOfPumpkinSpice + " mg");
    }

    public PumpkinSpiceLatte makePumpkinSpice() {
        System.out.println("\nMaking " + name);
        System.out.println("Intensity set to " + this.getIntensity());
        System.out.println("Adding " + this.mlOfMilk + " mls of milk");
        System.out.println("Adding " + mgOfPumpkinSpice + " mg of Pumpkin Spice");
        return this;
    }
}
