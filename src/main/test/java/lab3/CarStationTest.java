package lab3;

import oop.practice3.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static oop.practice3.CAR_TYPES.ELECTRIC;
import static oop.practice3.CAR_TYPES.GAS;
import static oop.practice3.PASSENGER_TYPES.PEOPLE;
import static oop.practice3.PASSENGER_TYPES.ROBOTS;
import static org.junit.jupiter.api.Assertions.*;


public class CarStationTest {
    private Queue<Car> cars;
    private CarStation carStation;

    @BeforeEach
    public void setUp() {
        cars = new LinkedQueue<>(5);
        Dineable diningService = carId -> System.out.println("Serving dinner to: " + carId);
        Refuelable refuelingService = (carId) -> System.out.println("Refueling: " + carId);

        carStation = new CarStation(diningService, refuelingService, cars);
    }

    @Test
    public void testAddCar() {
        Car car = new Car(1, ELECTRIC, PEOPLE, false, 42);
        carStation.addCar(car);

        assertFalse(cars.isEmpty());
        assertEquals(1, cars.size());
        assertEquals(car, cars.peek());
    }

    @Test
    public void testServeCars() {
        Car car1 = new Car(1, ELECTRIC, PEOPLE, false, 42);
        Car car2 = new Car(2, GAS, ROBOTS, true, 41);
        carStation.addCar(car1);
        carStation.addCar(car2);
        assertEquals(2, cars.size());
        carStation.serveCars();
        assertTrue(cars.isEmpty());

    }

    @Test
    public void testQueueOverflow() {
        for (int i = 1; i <= 5; i++) {
            carStation.addCar(new Car(14,GAS, PEOPLE, false,10));
        }

        assertThrows(IllegalStateException.class, () -> carStation.addCar(new Car(15,ELECTRIC, ROBOTS, true,10)),
                "Adding a car to a full queue should throw an exception");
    }
}
