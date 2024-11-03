package oop.practice1.day2;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static String readFileIntoString(String path) {
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            String data = null;
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            return data;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            return null;
        }
    }
}