package oop.practice2.day4;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Barista barista = new Barista();

        barista.makeCoffees(Arrays.asList("Cappuccino","Pumpkin Spice Latte", "Americano", "Syrup Cappuccino", "Espresso" ));
    }
}