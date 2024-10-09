package oop.practice;

public class creature {
    private int id;
    private Boolean isHuman;
    private String planet;
    private int age;
    private String[] traits;
    private String universe;

    public creature(int id, Boolean isHuman, String planet, int age, String[] traits) {
        this.id = id;
        this.isHuman = isHuman;
        this.planet = planet;
        this.age = age;
        this.traits = traits  ;
    }

    public void printCreature() {
        System.out.println("Creature");
        System.out.println("ID: " + id);
        System.out.println("IsHuman: " + isHuman);
        System.out.println("Planet: " + planet);
        System.out.println("Age: " + age);
        System.out.println("Traits: ");
    }
}
