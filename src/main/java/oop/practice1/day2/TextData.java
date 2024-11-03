package oop.practice1.day2;

public class TextData {
    private String fileName;
    private final String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord;

    public TextData(String text, String filePath){
        this.text = text;
        this.setFileName(filePath);
        this.computeDetails();
    }

    public String getText() {
        return text;
    }

    public String getFileName() {
        return fileName;
    }

    public int getNumberOfVowels(){
        return numberOfVowels;
    }

    public int getNumberOfConsonants(){
        return numberOfConsonants;
    }

    public int getNumberOfLetters(){
        return numberOfLetters;
    }

    public int getNumberOfSentences(){
        return numberOfSentences;
    }

    public String getLongestWord(){
        return longestWord;
    }

    private void computeDetails() {
        this.setVowelsCount();
        this.setConsonantsCount();
        this.setNumberOfLetters();
        this.setNumberOfSentences();
        this.setLongestWord();
    }

    private void setFileName(String filePath) {
        var parts = filePath.split("[/]");
        this.fileName = parts[parts.length - 1];
    }

    private void setVowelsCount() {
        this.numberOfVowels = (int) text.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }

    private void setConsonantsCount() {
        this.numberOfConsonants = (int) text.toLowerCase().chars().filter(c -> "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1).count();
    }

    private void setNumberOfLetters() {
        this.numberOfLetters = text.replaceAll("[^a-zA-Z]", "").length();
    }

    private void setNumberOfSentences() {
        this.numberOfSentences = text.split("[.!?]").length;
    }

    private void setLongestWord() {
        String[] words = text.split("[\\s+]"); //splits words by spaces, [\\s+] the regex for space
        String longestWord = "";
        for (String word : words){
            word = word.replaceAll("[^a-zA-Z-]", "");
            if (word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        this.longestWord = longestWord;
    }

}
