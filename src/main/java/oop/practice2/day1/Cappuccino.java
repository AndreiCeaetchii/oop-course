package oop.practice2.day1;

public class Cappuccino extends Coffe{
    private final int mlOfMilk;
    private static final String coffee = "Capuccino";

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity);
        this.mlOfMilk = mlOfMilk;
    }
}
