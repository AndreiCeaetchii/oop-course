package oop.practice3;

public class CarStation {
    private final Dineable diningService;
    private final Refuelable refuelingService;
    private final Queue<Car> queue;

    public CarStation(Dineable diningService, Refuelable refuelingService, Queue<Car> queue) {
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = queue;
    }

    public void serveCars() {
        while (!queue.isEmpty()) {
            Car car = queue.pop();
            if (car.isDining()){
                diningService.serveDinner(car.getId());
            }

            refuelingService.refuel(car.getId());
        }
    }

    public void addCar(Car car) {
        queue.push(car);
    }
}
