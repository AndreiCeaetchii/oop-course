package oop.practice3;

public class GasStation implements Refuelable {
    private static int totalGasCarsServed = 0;
    private static int totalGasConsumption = 0;

    @Override
    public void refuel(int carId, int consumption) {
        totalGasCarsServed++;
        totalGasConsumption += consumption;
        System.out.println("Refueling gas car " + carId + ".");
    }

    public static int getTotalGasCarsServed() {
        return totalGasCarsServed;
    }

    public static int getTotalGasConsumption() {
        return totalGasConsumption;
    }

    public static void resetTotalGasCarsServed() {
        totalGasCarsServed = 0;
        totalGasConsumption = 0;
    }
}
