package oop.practice3;

public class RobotDinner implements  Dineable{
    private static int totalRobotsServed = 0;
    @Override
    public void serveDinner(String carId) {
        totalRobotsServed++;
        System.out.println("Serving dinner to robot in car: " + carId);
    }

    public static int getTotalRobotsServed() {
        return totalRobotsServed;
    }

    public static void resetTotalRobotsServed() {
        totalRobotsServed = 0;
    }
}
