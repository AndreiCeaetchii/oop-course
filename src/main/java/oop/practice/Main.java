package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {


    Universe starWars = new Universe("starWars", new ArrayList<>());
    Universe hitchhikers = new Universe("hitchHiker", new ArrayList<>());
    Universe marvel = new Universe("marvel", new ArrayList<>());
    Universe rings = new Universe("rings", new ArrayList<>());

    JsonNode data = readFile.readInput();
    readFile.parseInput(data);

    for ( creature creature: readFile.creatureList){
      creature.findUniverse();
      creature.printCreature();
    }
//    mapper.writeValue(new File("src/main/resources/output/starwars.json"), starWars);
//    mapper.writeValue(new File("src/main/resources/output/hitchhiker.json"), hitchhikers);
//    mapper.writeValue(new File("src/main/resources/output/rings.json"), rings);
//    mapper.writeValue(new File("src/main/resources/output/marvel.json"), marvel);
  }
}

record Universe(
    String name,
    List<JsonNode> individuals
) { }
