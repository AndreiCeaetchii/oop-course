package oop.practice;

import java.util.Arrays;
import java.util.Objects;

public class creature {
    private int id;
    private Boolean isHumanoid;
    private String planet;
    private Integer age;
    private String[] traits;
    private String universe;

    public creature(int id, Boolean isHumanoid, String planet, Integer age, String[] traits) {
        this.id = id;
        this.isHumanoid = isHumanoid;
        this.planet = planet;
        this.age = age;
        this.traits = traits  ;
    }

    public int getId() {
        return id;
    }
    public Boolean getIsHumanoid() {
        return isHumanoid;
    }
    public String getPlanet() {
        return planet;
    }
    public Integer getAge() {
        return age;
    }
    public String[] getTraits() {
        return traits;
    }
    public String getUniverse() {
        return universe;
    }

    public void printCreature() {
//        System.out.println("Creature");
        System.out.print("ID: " + id + " ");
//        System.out.println("IsHumanoid: " + isHumanoid);
//        System.out.println("Planet: " + planet);
//        System.out.println("Age: " + age);
//        System.out.println("Traits: " + Arrays.toString(traits));
        System.out.println("Universe: " + universe);
    }

    public void findUniverse(){
        if(checkIfIsFromStarWars()){
            this.universe = "Star Wars";
        } else if (checkIfIsFromMarvel()){
            this.universe = "Marvel";
        } else if (checkIfIsFromHitchhikers()){
            this.universe = "Hitchhiker's";
        } else if (checkIfIsFromLordOfTheRings()){
            this.universe = "Lord of the rings";
        }
        else {
        this.universe = "Universe not found";}
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