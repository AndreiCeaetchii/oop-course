package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

import com. fasterxml. jackson. core. JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class View {
    private static final Universe starWars = new Universe("starWars", new ArrayList<>());
    private static final Universe hitchhikers = new Universe("hitchHiker", new ArrayList<>());
    private static final Universe marvel = new Universe("marvel", new ArrayList<>());
    private static final Universe rings = new Universe("rings", new ArrayList<>());

    public static void WriteInOutputFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        for (creature creature : readFile.creatureList) {
            JSONObject creatureJson = new JSONObject();
            creatureJson.put("id", creature.getId());
            creatureJson.put("isHumanoid", creature.getIsHumanoid());
            creatureJson.put("planet", creature.getPlanet());
            creatureJson.put("age", creature.getAge());
            creatureJson.put("traits", creature.getTraits());
            String universe = creature.getUniverse();

            // Convert JSONObject to JsonNode
            JsonNode creatureNode = mapper.readTree(creatureJson.toString());

            switch (universe) {
                case "Star Wars":
                    starWars.individuals().add(creatureNode);
                    break;
                case "Hitchhiker's":
                    hitchhikers.individuals().add(creatureNode);
                    break;
                case "Marvel":
                    marvel.individuals().add(creatureNode);
                    break;
                case "Lord of the rings":
                    rings.individuals().add(creatureNode);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        mapper.writeValue(new File("src/main/resources/output/starwars.json"), starWars);
        mapper.writeValue(new File("src/main/resources/output/hitchhiker.json"), hitchhikers);
        mapper.writeValue(new File("src/main/resources/output/rings.json"), rings);
        mapper.writeValue(new File("src/main/resources/output/marvel.json"), marvel);
    }


}
record Universe(
        String name,
        List<JsonNode> individuals
) { }