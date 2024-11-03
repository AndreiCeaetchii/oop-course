package oop.practice2.day1;

public class Capuccino extends Coffe{
    private int mlOfMilk;
    private static final String coffee = "Capuccino";

    public Capuccino(Intensity intensity, int mlOfMilk) {
        super(intensity);
        this.mlOfMilk = mlOfMilk;
    }
}
