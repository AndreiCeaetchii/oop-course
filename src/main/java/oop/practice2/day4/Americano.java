package oop.practice2.day4;

public class Americano extends Coffee {
    private final int mlOfWater;
    private final String coffeeName = "Americano";

    public Americano(Intensity intensity, int mlOfWater) {
        super(intensity);
        this.mlOfWater = mlOfWater;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println(coffeeName + " water: " + mlOfWater + " ml");
    }

    public Americano makeAmericano() {
        System.out.println("\nMaking " + coffeeName);
        System.out.println("Intensity set to " + this.getIntensity());
        System.out.println("Adding " + mlOfWater + " mls of water");
        return this;
    }
}
