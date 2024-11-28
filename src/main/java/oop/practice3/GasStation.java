package oop.practice3;

public class GasStation implements Refuelable {
    private static int totalGasCarsServed = 0;

    @Override
    public void refuel(String carId) {
        totalGasCarsServed++;
        System.out.println("Refueling gas car " + carId + ".");
    }

    public static int getTotalGasCarsServed() {
        return totalGasCarsServed;
    }

    public static void resetTotalGasCarsServed() {
        totalGasCarsServed = 0;
    }
}
