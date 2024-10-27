package oop.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Classification {
    private final Boolean isHumanoid;
    private final String planet;
    private final Integer age;
    private final String[] traits;

    public Classification(Boolean isHumanoid, String planet, Integer age, String[] traits) {
        this.isHumanoid = isHumanoid;
        this.planet = planet;
        this.age = age;
        this.traits = traits;
    }

    public String findUniverse() {
        if(checkIfIsFromStarWars()){
            return "Star Wars";
        } else if (checkIfIsFromMarvel()){
            return  "Marvel";
        } else if (checkIfIsFromHitchhikers()){
            return  "Hitchhiker's";
        } else if (checkIfIsFromLordOfTheRings()){
            return  "Lord of the rings";
        } else {
            return  "Universe not found";
        }
    }

    private boolean containsTrait(String trait) {
        return traits != null && Arrays.asList(traits).contains(trait);
    }

    private Boolean checkIfIsFromStarWars(){
        //check if is a valid Kashyyyk
        boolean validHumanoid = Boolean.FALSE.equals(isHumanoid) || isHumanoid == null;
        boolean validPlanet = Objects.equals(planet, "Kashyyyk") || planet == null;
        boolean validAge = age == null || (age >= 0 && age <= 400);
        boolean validTraits = containsTrait("HAIRY") || containsTrait("TALL") || traits == null;;

        if (validHumanoid && validPlanet && validAge && validTraits){
            return true;
        }
        //check if is a valid ewok
        validHumanoid = Boolean.FALSE.equals(isHumanoid) || isHumanoid == null;
        validPlanet = Objects.equals(planet, "Endor") || planet == null;
        validAge = age == null || (age >= 0 && age <= 60);
        validTraits = containsTrait("SHORT") || containsTrait("HAIRY") || traits == null;

        return validHumanoid && validPlanet && validAge && validTraits;
    }

    private Boolean checkIfIsFromMarvel(){
        //check if is a valid Asgardian
        boolean validHumanoid = Boolean.TRUE.equals(isHumanoid) || isHumanoid == null;
        boolean validPlanet = Objects.equals(planet, "Asgard") || planet == null;
        boolean validAge = age == null || (age >= 0 && age <= 5000);
        boolean validTraits = containsTrait("BLONDE") || containsTrait("TALL") || traits == null;

        return validHumanoid && validPlanet && validAge && validTraits;
    }

    private Boolean checkIfIsFromHitchhikers (){
        //check if is a valid Betelgeusian
        boolean validHumanoid = Boolean.TRUE.equals(isHumanoid) || isHumanoid == null;
        boolean validPlanet = Objects.equals(planet, "Betelgeuse") || planet == null;
        boolean validAge = age == null || (age >= 0 && age <= 100);
        boolean validTraits = containsTrait("EXTRA_ARMS") || containsTrait("EXTRA_HEAD") || traits == null;//check if is a valid Asgardian

        if (validHumanoid && validPlanet && validAge && validTraits){
            return true;
        }
        //check if is a valid Vogons
        validHumanoid = Boolean.FALSE.equals(isHumanoid) || isHumanoid == null;
        validPlanet = Objects.equals(planet, "Vogsphere") || planet == null;
        validAge = age == null || (age >= 0 && age <= 200);
        validTraits = containsTrait("GREEN") || containsTrait("BULKY") || traits == null;

        return validHumanoid && validPlanet && validAge && validTraits;
    }

    private Boolean checkIfIsFromLordOfTheRings (){
        //check if is a valid Elf
        boolean validHumanoid = Boolean.TRUE.equals(isHumanoid) || isHumanoid == null;
        boolean validPlanet = Objects.equals(planet, "Earth") || planet == null;
        boolean validTraits = containsTrait("BLONDE") || containsTrait("POINTY_EARS") || traits == null;//check if is a valid Asgardian


        if (validHumanoid && validPlanet && validTraits){
            return true;
        }
        //check if is a valid Dwarf
        validHumanoid = Boolean.TRUE.equals(isHumanoid) || isHumanoid == null;
        validPlanet = Objects.equals(planet, "Earth") || planet == null;
        boolean validAge = age == null || (age >= 0 && age <= 200);
        validTraits = containsTrait("SHORT") || containsTrait("BULKY") || traits == null;

        return validHumanoid && validPlanet && validAge && validTraits;
    }

}