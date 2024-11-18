package oop.practice2.day1;

public class SyrupCappuccino extends Cappuccino{
    private int mltrOfMilk;
    private final SyrupType syrup;
    private final String coffee = "SyrupCappuccino";

    public SyrupCappuccino(Intensity intensity, int mltrOfMilk, SyrupType syrup) {
        super(intensity, mltrOfMilk);
        this.syrup = syrup;
    }
}
