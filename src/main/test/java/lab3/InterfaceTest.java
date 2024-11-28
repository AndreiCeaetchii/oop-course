package lab3;

import oop.practice3.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InterfaceTest {

    private Dineable peopleDinner1;
    private Dineable peopleDinner2;
    private Dineable robotDinner;
    private Refuelable gasStation1;
    private Refuelable gasStation2;
    private Refuelable electricStation;

    public static void displayCounts() {
        System.out.println();
        System.out.println("People served: " + PeopleDinner.getTotalPeopleServed());
        System.out.println("Robots served: " + RobotDinner.getTotalRobotsServed());
        System.out.println("Gas cars refueled: " + GasStation.getTotalGasCarsServed());
        System.out.println("Electric cars refueled: " + ElectricStation.getTotalElectricCarsServed());
    }

    @BeforeEach
    public void setUp() {
        peopleDinner1 = new PeopleDinner();
        peopleDinner2 = new PeopleDinner();
        robotDinner = new RobotDinner();
        gasStation1 = new GasStation();
        gasStation2 = new GasStation();
        electricStation = new ElectricStation();

        // Reset counters
        PeopleDinner.resetTotalPeopleServed();
        RobotDinner.resetTotalRobotsServed();
        GasStation.resetTotalGasCarsServed();
        ElectricStation.resetTotalElectricCarsServed();
    }

    @Test
    public void testServeDinner() {
        peopleDinner1.serveDinner(1);
        peopleDinner2.serveDinner(2);
        robotDinner.serveDinner(3);

        System.out.println();
        assertEquals(2, PeopleDinner.getTotalPeopleServed());
        assertEquals(1, RobotDinner.getTotalRobotsServed());
    }

    @Test
    public void testRefuel() {
        gasStation1.refuel(4);
        gasStation2.refuel(5);
        electricStation.refuel(6);
        electricStation.refuel(7);

        System.out.println();
        assertEquals(2, GasStation.getTotalGasCarsServed());
        assertEquals(2, ElectricStation.getTotalElectricCarsServed());
    }

    @Test
    public void testGlobalTracking() {
        // Serve some cars
        peopleDinner1.serveDinner(1);
        peopleDinner2.serveDinner(1);
        robotDinner.serveDinner(3);
        gasStation1.refuel(4);
        gasStation2.refuel(5);
        electricStation.refuel(6);
        electricStation.refuel(7);

        System.out.println();
        assertEquals(2, PeopleDinner.getTotalPeopleServed(), "Total people served should be 2");
        assertEquals(1, RobotDinner.getTotalRobotsServed(), "Total robots served should be 1");
        assertEquals(2, GasStation.getTotalGasCarsServed(), "Total gas cars served should be 2");
        assertEquals(2, ElectricStation.getTotalElectricCarsServed(), "Total electric cars served should be 2");

        displayCounts();
    }

}