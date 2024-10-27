package oop.practice1.day4;


import oop.practice1.day2.ReadFile;
import oop.practice1.day2.TextData;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("You did not provide at least a file path");
        }

        for (String filePath : args) {
            String data = ReadFile.readFileIntoString(filePath);

            TextData textData = new TextData(data, filePath);
            System.out.println("Text:" + textData.getText());
            System.out.println("FileName:" + textData.getFileName());
            System.out.println("Number Of Vowels:" + textData.getNumberOfVowels());
            System.out.println("Number Of Consonants:" + textData.getNumberOfConsonants());
            System.out.println("Number Of Letters:" + textData.getNumberOfLetters());
            System.out.println("Number Of Sentences:" + textData.getNumberOfSentences());
            System.out.println("Longest Word:" + textData.getLongestWord());

            System.out.println("----------------------------------------");

        }
    }
}