package oop.practice3;

public class ElectricStation implements Refuelable {
    private static int totalElectricCarsServed = 0;

    @Override
    public void refuel(String carId) {
        totalElectricCarsServed++;
        System.out.println("Refueling electric car " + carId + ".");
    }

    public static int getTotalElectricCarsServed() {
        return totalElectricCarsServed;
    }

    public static void resetTotalElectricCarsServed() {
        totalElectricCarsServed = 0;
    }
}
