package oop.practice2.day1;

public class SyrupCappuccino extends Coffe{
    private int mltrOfMilk;
    private SyrupType syrup;
    private final String coffee = "SyrupCappuccino";

    public SyrupCappuccino(Intensity intensity, int mltrOfMilk, SyrupType syrup) {
        super(intensity);
        this.mltrOfMilk = mltrOfMilk;
        this.syrup = syrup;
    }
}
