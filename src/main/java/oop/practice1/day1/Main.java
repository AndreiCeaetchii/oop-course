package oop.practice1.day1;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Display Display1 = new Display(3840, 2160, 282, "ASUS Vivobook" );
        Display Display2 = new Display(2560, 1600, 227, "MacBook Pro 13");
        Display Display3 = new Display(1920, 1080, 141, "Lenovo IdeaPad Slim 3");

        Display1.compareWithMonitor(Display2);
        Display2.compareWithMonitor(Display3);
        Display1.compareWithMonitor(Display3);
    }
}