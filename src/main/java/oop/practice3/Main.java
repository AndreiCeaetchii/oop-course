package oop.practice3;

public class Main {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler("C:\\Users\\ceaet\\Desktop\\java-classifcation\\src\\main\\resources\\queue");
        scheduler.schedulePolling(2); // Poll every 3 seconds
        scheduler.scheduleServing(5); // Serve 5 seconds


        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\nShutting down program...");
        }));
    }
}