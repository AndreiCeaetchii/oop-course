package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.json.JSONObject;

public class readFile {
    public static JsonNode readInput() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File inputFile = new File("src/main/resources/test-input.json");
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
            //TODO function that parse the json
            JSONObject jsonpObject = new JSONObject(entryAsString);
            System.out.println(jsonpObject.getInt("id"));

            if (jsonpObject.has("isHumanoid")) {System.out.println(jsonpObject.getBoolean("isHumanoid"));}
            else {System.out.println("Null");}

            if (jsonpObject.has("planet")) {System.out.println(jsonpObject.getString("planet"));}
            else {System.out.println("Null");}

            if (jsonpObject.has("age")) {System.out.println(jsonpObject.getInt("age"));}
            else {System.out.println("Null");}

            if (jsonpObject.has("traits")) {System.out.println(jsonpObject.getJSONArray("traits"));}
            else {System.out.println("Null");}
        }
    }
}
