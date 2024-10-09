package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class readFile {

    public static List<creature> creatureList = new ArrayList<>();

    public static JsonNode readInput() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
//        File inputFile = new File("src/main/resources/test-input.json");
        File inputFile = new File("src/main/resources/inputx2.json");
        JsonNode data = mapper.readTree(inputFile).get("data");

        Scanner scanner = new Scanner(System.in);
        for (JsonNode entry : data) {
            String entryAsString = entry.toString();
            System.out.println(entryAsString);
        }
        scanner.close();
        return data;
    }

    public static void parseInput(JsonNode data) throws IOException {
        for (JsonNode entry : data)
        {
            String entryAsString = entry.toString();

            //getting the information about the creature from json
            JSONObject jsonpObject = new JSONObject(entryAsString);
            int id = jsonpObject.getInt("id");
            Boolean isHuman = jsonpObject.has("isHumanoid")? jsonpObject.getBoolean("isHumanoid"): null;
            String planet = jsonpObject.has("planet")? jsonpObject.getString("planet"): null;
            Integer age = jsonpObject.has("age")? jsonpObject.getInt("age"): null;
            JSONArray jsonTraits = jsonpObject.has("traits") ? jsonpObject.getJSONArray("traits") : null;

            //check if the creature have some traits and convert into an array of traits
            if (jsonTraits != null) {
                String[] traits = new String[jsonTraits.length()];
                for (int i = 0; i < jsonTraits.length(); i++) {
                    traits[i] = jsonTraits.getString(i);
                }
                creature creature = new creature(id, isHuman, planet, age, traits);
//                creature.printCreature();
                creatureList.add(creature);
            }
            else {
                creature creature = new creature(id, isHuman, planet, age, null);
//                creature.printCreature();
                creatureList.add(creature);
            }
        }
    }
}
