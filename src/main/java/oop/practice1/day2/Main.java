package oop.practice1.day2;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = args[0];
        String data = ReadFile.readFileIntoString(filePath);

        TextData textData = new TextData(data, filePath);
        System.out.println("Text:" + textData.getText());
        System.out.println("FileName:" + textData.getFileName());
        System.out.println("Number Of Vowels:" + textData.getNumberOfVowels());
        System.out.println("Number Of Consonants:" + textData.getNumberOfConsonants());
        System.out.println("Number Of Letters:" + textData.getNumberOfLetters());
        System.out.println("Number Of Sentences:" + textData.getNumberOfSentences());
        System.out.println("Longest Word:" + textData.getLongestWord());

    }
}
