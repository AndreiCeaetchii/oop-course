package oop.practice2.day2;


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
}
