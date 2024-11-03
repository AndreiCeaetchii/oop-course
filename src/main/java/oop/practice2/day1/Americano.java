package oop.practice2.day1;

public class Americano extends Coffe{
    private int mlOfWater;
    private final String coffeeName = "Americano";


    public Americano(Intensity intensity, int mlOfWater) {
        super(intensity);
        this.mlOfWater = mlOfWater;
    }
}
