package oop.practice3;

public class PeopleDinner implements Dineable {
    private static int totalPeopleServed = 0;
    @Override
    public void serveDinner(String carId) {
        totalPeopleServed++;
        System.out.println("Serving dinner to people in car: " + carId + ".");
    }

    public static int getTotalPeopleServed() {
        return totalPeopleServed;
    }


    public static void resetTotalPeopleServed() {
        totalPeopleServed = 0;
    }
}
