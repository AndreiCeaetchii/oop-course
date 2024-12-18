package oop.practice2.day4;


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

    protected void make(){
        super.make();
        System.out.println("Adding " + mgOfPumpkinSpice + " mg of Pumpkin Spice");
    }

    public final PumpkinSpiceLatte makePumpkinSpiceLatte() {
        System.out.println("\nMaking " + name);
        make();
        return this;
    }
}
