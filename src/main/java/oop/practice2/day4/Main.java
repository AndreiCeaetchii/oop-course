package oop.practice2.day4;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Barista barista = new Barista();

        // Create various coffee orders
        CoffeeOrder cappuccinoOrder = new CoffeeOrder("cappuccino", Intensity.NORMAL, null, 150, null, null);
        CoffeeOrder americanoOrder = new CoffeeOrder("americano", Intensity.STRONG, 100, null, null, null);
        CoffeeOrder pumpkinSpiceLatteOrder = new CoffeeOrder("pumpkin spice latte", Intensity.LIGHT, null, 150, null, 50);
        CoffeeOrder syrupCappuccinoOrder = new CoffeeOrder("syrup cappuccino", Intensity.STRONG, null, 100, SyrupType.POPCORN, null);

        barista.makeCoffees(Arrays.asList(cappuccinoOrder, americanoOrder, pumpkinSpiceLatteOrder, syrupCappuccinoOrder));
    }
}