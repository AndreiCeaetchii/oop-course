package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;


public class Main {
  public static void main(String[] args) throws IOException {
    JsonNode data = readFile.readCreaturesFromFile();

    //get the creatures from the file
    var creatureList = readFile.parseCreatures(data);

    View.WriteInOutputFile(creatureList);

  }
}
