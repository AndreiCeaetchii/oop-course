package oop.practice2.day2;

public class Coffee {
    protected Intensity coffeeIntensity;
    private static final String name = "Coffee";

    public Coffee(Intensity intensity) {
        this.coffeeIntensity = intensity;
    }

    public void printCoffeeDetails() {
        System.out.println("Coffee intensity: " + this.coffeeIntensity);
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