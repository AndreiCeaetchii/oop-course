package oop.practice3;

public class ElectricStation implements Refuelable {
    private static int totalElectricCarsServed = 0;
    private static int totalElectricConsumption = 0;

    @Override
    public void refuel(int carId, int consumption) {
        totalElectricCarsServed++;
        totalElectricConsumption += consumption;
        System.out.println("Refueling electric car " + carId + ".");
    }

    public static int getTotalElectricCarsServed() {
        return totalElectricCarsServed;
    }

    public static int getTotalElectricConsumption() {
        return totalElectricConsumption;
    }

    public static void resetTotalElectricCarsServed() {
        totalElectricCarsServed = 0;
        totalElectricConsumption = 0;
    }
}
