package oop.practice2.day4;

public class CoffeeOrder {
    private final String type;
    private final Intensity intensity;
    private final Integer mlOfWater;
    private final Integer mlOfMilk;
    private final SyrupType syrupType;
    private final Integer mgOfPumpkinSpice;

    public CoffeeOrder(String type, Intensity intensity, Integer mlOfWater, Integer mlOfMilk, SyrupType syrupType, Integer mgOfPumpkinSpice) {
        this.type = type;
        this.intensity = intensity;
        this.mlOfWater = mlOfWater;
        this.mlOfMilk = mlOfMilk;
        this.syrupType = syrupType;
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public String getType() { return type; }
    public Intensity getIntensity() { return intensity; }
    public int getMlOfWater() { return mlOfWater; }
    public int getMlOfMilk() { return mlOfMilk; }
    public SyrupType getSyrupType() { return syrupType; }
    public Integer getMgOfPumpkinSpice() { return mgOfPumpkinSpice; }
}
