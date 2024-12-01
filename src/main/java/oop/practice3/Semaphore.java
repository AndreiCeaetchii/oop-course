package oop.practice3;

import java.util.HashMap;
import java.util.Map;

public class Semaphore {
    private final CarStation gasPeopleStation;
    private final CarStation gasRobotStation;
    private final CarStation electricPeopleStation;
    private final CarStation electricRobotStation;

    private final Map<CAR_TYPES, Integer> carTypeCount = new HashMap<>();
    private final Map<PASSENGER_TYPES, Integer> passengerTypeCount = new HashMap<>();

    private int diningCount = 0;
    private int notDiningCount = 0;

    public Semaphore(CarStation gasPeopleStation, CarStation gasRobotStation, CarStation electricPeopleStation, CarStation electricRobotStation) {

        this.gasPeopleStation = gasPeopleStation;
        this.gasRobotStation = gasRobotStation;
        this.electricPeopleStation = electricPeopleStation;
        this.electricRobotStation = electricRobotStation;

        carTypeCount.put(CAR_TYPES.GAS, 0);
        carTypeCount.put(CAR_TYPES.ELECTRIC, 0);
        passengerTypeCount.put(PASSENGER_TYPES.PEOPLE, 0);
        passengerTypeCount.put(PASSENGER_TYPES.ROBOTS, 0);
    }


    public void routeCar(Car car){
        CAR_TYPES type = car.getType();
        PASSENGER_TYPES passengerType = car.getPassengersType();

        if (CAR_TYPES.GAS.equals(type)){
            if (PASSENGER_TYPES.PEOPLE.equals(passengerType)){
                gasPeopleStation.addCar(car);
                carTypeCount.put(CAR_TYPES.GAS, carTypeCount.get(CAR_TYPES.GAS) + 1);
                passengerTypeCount.put(PASSENGER_TYPES.PEOPLE, passengerTypeCount.get(PASSENGER_TYPES.PEOPLE) + 1);
            } else if (PASSENGER_TYPES.ROBOTS.equals(passengerType)){
                gasRobotStation.addCar(car);
                carTypeCount.put(CAR_TYPES.GAS, carTypeCount.get(CAR_TYPES.GAS) + 1);
                passengerTypeCount.put(PASSENGER_TYPES.ROBOTS, passengerTypeCount.get(PASSENGER_TYPES.ROBOTS) + 1);
            }
        } else if (CAR_TYPES.ELECTRIC.equals(type)) {
            if (PASSENGER_TYPES.PEOPLE.equals(passengerType)){
                electricPeopleStation.addCar(car);
                carTypeCount.put(CAR_TYPES.ELECTRIC, carTypeCount.get(CAR_TYPES.ELECTRIC) + 1);
                passengerTypeCount.put(PASSENGER_TYPES.PEOPLE, passengerTypeCount.get(PASSENGER_TYPES.PEOPLE) + 1);
            }
            else if (PASSENGER_TYPES.ROBOTS.equals(passengerType)) {
                electricRobotStation.addCar(car);
                carTypeCount.put(CAR_TYPES.ELECTRIC, carTypeCount.get(CAR_TYPES.ELECTRIC) + 1);
                passengerTypeCount.put(PASSENGER_TYPES.ROBOTS, passengerTypeCount.get(PASSENGER_TYPES.ROBOTS) + 1);
            }
        } else {
            System.err.println("Unknown car type " + car);
        }

        if (car.isDining()){
            diningCount++;
        } else {
            notDiningCount++;
        }
    }

    public void serveAllCars(){
        gasPeopleStation.serveCars();
        gasRobotStation.serveCars();
        electricPeopleStation.serveCars();
        electricRobotStation.serveCars();
    }

    public Map<String, Integer> getStats() {
        Map<String, Integer> resultStats = new HashMap<>();
        resultStats.put("GAS", carTypeCount.get(CAR_TYPES.GAS));
        resultStats.put("ELECTRIC", carTypeCount.get(CAR_TYPES.ELECTRIC));
        resultStats.put("PEOPLE", passengerTypeCount.get(PASSENGER_TYPES.PEOPLE));
        resultStats.put("ROBOTS", passengerTypeCount.get(PASSENGER_TYPES.ROBOTS));
        resultStats.put("DINING", diningCount);
        resultStats.put("NOT_DINING", notDiningCount);
        return resultStats;
    }

}
