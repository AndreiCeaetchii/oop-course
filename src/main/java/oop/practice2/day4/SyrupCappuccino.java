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

    protected void make() {
        super.make();
        System.out.println("Adding " + syrup + " syrup");
    }


    public final SyrupCappuccino makeSyrupCappuccino() {
        System.out.println("\nMaking " + coffee);
        make();
        return this;
    }
}
