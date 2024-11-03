package oop.practice2.day4;


public class SyrupCappuccino extends Cappuccino {
    private int mltrOfMilk;
    private SyrupType syrup;
    private final String coffee = "SyrupCappuccino";

    public SyrupCappuccino(Intensity intensity, int mltrOfMilk, SyrupType syrup) {
        super(intensity, mltrOfMilk);
        this.syrup = syrup;
    }

    @Override
    public void printCoffeeDetails(){
        super.printCoffeeDetails();
        System.out.println(coffee + " syrup: " + syrup);
    }

    public SyrupCappuccino makeSyrupCappuccino() {
        System.out.println("\nMaking " + coffee);
        System.out.println("Intensity set to " + this.getIntensity());
        System.out.println("Adding " + this.mlOfMilk + " mls of milk");
        System.out.println("Adding " + syrup + " syrup");
        return this;
    }
}
