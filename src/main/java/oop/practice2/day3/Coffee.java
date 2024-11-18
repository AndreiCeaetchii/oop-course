package oop.practice2.day3;

public class Coffee {
    private final Intensity coffeeIntensity;
    private static final String name = "Coffee";

    public Coffee(Intensity intensity) {
        this.coffeeIntensity = intensity;
    }

    public void printCoffeeDetails() {
        System.out.println("Coffee intensity: " + this.coffeeIntensity);
    }

    public Intensity getIntensity() {
        return coffeeIntensity;
    }
}

enum Intensity {
    LIGHT,
    NORMAL,
    STRONG
}

enum SyrupType {
    MACADAMIA, VANILLA,
    COCONUT, CARAMEL,
    CHOCOLATE, POPCORN
}