package oop.practice2.day3;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(Intensity.NORMAL);
        Cappuccino cappuccino = new Cappuccino(Intensity.STRONG, 50);
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.STRONG, 60, 20);
        Americano americano = new Americano(Intensity.LIGHT, 150);
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.NORMAL, 70, SyrupType.VANILLA);

        cappuccino.makeCappuccino();
        System.out.println();

        pumpkinSpiceLatte.makePumpkinSpice();
        System.out.println();

        americano.makeAmericano();
        System.out.println();

        syrupCappuccino.makeSyrupCappuccino();
    }
}