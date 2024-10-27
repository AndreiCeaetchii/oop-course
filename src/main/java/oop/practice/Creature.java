package oop.practice;

public class Creature {
    private int id;
    private Boolean isHumanoid;
    private String planet;
    private Integer age;
    private String[] traits;
    private Classification universe;

    public Creature(int id, Boolean isHumanoid, String planet, Integer age, String[] traits) {
        this.id = id;
        this.isHumanoid = isHumanoid;
        this.planet = planet;
        this.age = age;
        this.traits = traits  ;
        this.universe = new Classification(isHumanoid, planet, age, traits);
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
        return universe.findUniverse();
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
}
