package oop.practice2.day4;

import java.util.List;

public class Barista {
    public void makeCoffees(List<String> orders) {
        for (String order : orders) {
            Coffee coffee = createCoffee(order);
            if (coffee != null) {
                switch (order.toLowerCase()) {
                    case "cappuccino":
                        ((Cappuccino) coffee).makeCappuccino();
                        break;
                    case "americano":
                        ((Americano) coffee).makeAmericano();
                        break;
                    case "pumpkin spice latte":
                        ((PumpkinSpiceLatte) coffee).makePumpkinSpiceLatte();
                        break;
                    case "syrup cappuccino":
                        ((SyrupCappuccino) coffee).makeSyrupCappuccino();
                        break;
                    default:
                        System.out.println("Unknown coffee type: " + order);
                        break;
                }
            } else {
                System.out.println("\nSorry, we don't serve " + order + ".");
            }
        }
    }

    private Coffee createCoffee(String order) {
        switch (order.toLowerCase()) {
            case "cappuccino":
                return new Cappuccino(Intensity.NORMAL, 150);
            case "americano":
                return new Americano(Intensity.STRONG, 100);
            case "pumpkin spice latte":
                return new PumpkinSpiceLatte(Intensity.LIGHT, 150, 50);
            case "syrup cappuccino":
                return new SyrupCappuccino(Intensity.STRONG, 100, SyrupType.POPCORN);
            default:
                return null;
        }
    }
}
