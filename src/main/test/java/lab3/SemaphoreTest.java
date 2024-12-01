package lab3;
import oop.practice3.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;


public class SemaphoreTest {
    private Semaphore semaphore;

    @BeforeEach
    public void setUp() {
        CarStation gasPeopleStation = new CarStation(
                new PeopleDinner(),
                new GasStation(),
                new LinkedQueue<>(10)
        );

        CarStation gasRobotStation = new CarStation(
                new RobotDinner(),
                new GasStation(),
                new LinkedQueue<>(10)
        );

        CarStation electricPeopleStation = new CarStation(
                new PeopleDinner(),
                new ElectricStation(),
                new LinkedQueue<>(10)
        );

        CarStation electricRobotStation = new CarStation(
                new RobotDinner(),
                new ElectricStation(),
                new LinkedQueue<>(10)
        );

        semaphore = new Semaphore(gasPeopleStation, gasRobotStation, electricPeopleStation, electricRobotStation);
    }

    @Test
    public void testSemaphore() throws InterruptedException {
        semaphore.routeCar(new Car(1, CAR_TYPES.GAS, PASSENGER_TYPES.PEOPLE, true, 41));
        semaphore.routeCar(new Car(2, CAR_TYPES.ELECTRIC, PASSENGER_TYPES.ROBOTS, false, 42));
        semaphore.routeCar(new Car(3, CAR_TYPES.ELECTRIC, PASSENGER_TYPES.PEOPLE, false, 19));
        semaphore.routeCar(new Car(4, CAR_TYPES.ELECTRIC, PASSENGER_TYPES.PEOPLE, false, 25));
        semaphore.routeCar(new Car(5, CAR_TYPES.ELECTRIC, PASSENGER_TYPES.PEOPLE, false, 22));
        semaphore.routeCar(new Car(6, CAR_TYPES.GAS, PASSENGER_TYPES.PEOPLE, false, 46));
        semaphore.routeCar(new Car(7, CAR_TYPES.GAS, PASSENGER_TYPES.ROBOTS, false, 18));
        semaphore.routeCar(new Car(8, CAR_TYPES.GAS, PASSENGER_TYPES.PEOPLE, false, 11));
        semaphore.routeCar(new Car(9, CAR_TYPES.ELECTRIC, PASSENGER_TYPES.ROBOTS, true, 39));
        semaphore.routeCar(new Car(10, CAR_TYPES.ELECTRIC, PASSENGER_TYPES.PEOPLE, true, 32));

        semaphore.serveAllCars();
        Map<String, Integer> stats = semaphore.getStats();
        assertEquals(6, stats.get("ELECTRIC"), "6 ELECTRIC cars should have been routed");
        assertEquals(4, stats.get("GAS"), "4 GAS cars should have been routed");
        assertEquals(7, stats.get("PEOPLE"), "7 ROBOTS cars should have been routed");
        assertEquals(3, stats.get("ROBOTS"),  "3 ROBOTS cars should have been routed");
        assertEquals(3, stats.get("DINING"), "3 DINING cars should have been routed");
        assertEquals(7, stats.get("NOT_DINING"), "7 NOT_DINING cars should have been routed");
    }

}
