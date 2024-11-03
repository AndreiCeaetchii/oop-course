package oop.practice2.day4;

import java.util.List;

public class Barista {
    public void makeCoffees(List<CoffeeOrder> orders) {
        for (CoffeeOrder order : orders) {
            Coffee coffee = createCoffee(order);
            if (coffee != null) {
                switch (order.getType()) {
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

    private Coffee createCoffee(CoffeeOrder order) {
        switch (order.getType().toLowerCase()) {
            case "cappuccino":
                return new Cappuccino(order.getIntensity(), order.getMlOfMilk());
            case "americano":
                return new Americano(order.getIntensity(), order.getMlOfWater());
            case "pumpkin spice latte":
                return new PumpkinSpiceLatte(order.getIntensity(), order.getMlOfMilk(), order.getMgOfPumpkinSpice());
            case "syrup cappuccino":
                return new SyrupCappuccino(order.getIntensity(), order.getMlOfMilk(), order.getSyrupType());
            default:
                return null;
        }
    }
}
