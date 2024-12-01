package oop.practice3;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {
    private final int id;
    private final CAR_TYPES type;
    private final PASSENGER_TYPES passengersType;
    private final boolean isDining;
    private final int consumption;

    public Car(
            @JsonProperty("id") int id,
            @JsonProperty("type") CAR_TYPES Type,
            @JsonProperty("passengers") PASSENGER_TYPES passengers,
            @JsonProperty("isDining") boolean isDining,
            @JsonProperty("consumption") int consumption) {
        this.id = id;
        this.type = Type;
        this.passengersType = passengers;
        this.isDining = isDining;
        this.consumption = consumption;
    }

    public int getId() {
        return id;
    }
    public CAR_TYPES getType() {
        return type;
    }

    public PASSENGER_TYPES getPassengersType() {
        return passengersType;
    }

    public boolean isDining() {
        return isDining;
    }

    public int getConsumption() {
        return consumption;
    }

}
