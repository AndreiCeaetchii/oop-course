package oop.practice2.day1;

public class Coffe {
    protected Intensity coffeeIntensity;
    private static final String name = "Coffee";

    public Coffe(Intensity intensity) {
        this.coffeeIntensity = intensity;
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