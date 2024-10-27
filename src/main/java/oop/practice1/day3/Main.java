package oop.practice1.day3;

import oop.practice1.day1.Display;
import oop.practice1.day2.ReadFile;
import oop.practice1.day2.TextData;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Display Display1 = new Display(1920, 1080, 282, "ASUS Vivobook" );
        Display Display2 = new Display(2560, 1600, 227, "MacBook Pro 13");
        Display Display3 = new Display(1920, 1080, 141, "Lenovo IdeaPad Slim 3");

        Assistant assistant = new Assistant("Andrew Assistant");

        assistant.assignDisplay(Display1);
        assistant.assignDisplay(Display2);
        assistant.assignDisplay(Display3);

        assistant.assist();

        assistant.buyDisplay(Display1);
    }
}