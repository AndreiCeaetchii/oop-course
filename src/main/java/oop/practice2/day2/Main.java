package oop.practice2.day2;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(Intensity.NORMAL);
        Cappuccino cappuccino = new Cappuccino(Intensity.STRONG, 50);
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.STRONG, 60, 20);
        Americano americano = new Americano(Intensity.LIGHT, 150);
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.NORMAL, 70, SyrupType.VANILLA);

        coffee.printCoffeeDetails();
        System.out.println();

        cappuccino.printCoffeeDetails();
        System.out.println();

        pumpkinSpiceLatte.printCoffeeDetails();
        System.out.println();

        americano.printCoffeeDetails();
        System.out.println();

        syrupCappuccino.printCoffeeDetails();
    }
}