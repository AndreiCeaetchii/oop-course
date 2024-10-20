package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;


public class Main {
  public static void main(String[] args) throws IOException {
    JsonNode data = readFile.readInput();
    readFile.parseInput(data);

    View.WriteInOutputFile();

  }
}
