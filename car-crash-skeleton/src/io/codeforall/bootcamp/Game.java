package io.codeforall.bootcamp;

import io.codeforall.bootcamp.cars.Car;
import io.codeforall.bootcamp.cars.CarFactory;
import io.codeforall.bootcamp.field.Field;

public class Game {

    public static final int MANUFACTURED_CARS = 20;

    /**
     * Container of Cars
     */
    private Car[] cars;

    /**
     * Animation delay
     */
    private int delay;

    public Game(int cols, int rows, int delay) {

        Field.init(cols, rows);
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();
        }

        Field.draw(cars);

    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            moveAllCars();

            // Update screen
            Field.draw(cars); // this is the graphical move

        }

    }

    private void moveAllCars() {
        for (Car car : cars) {
            car.moveAndCheck(cars);

           /* if (car.isCrashed()) {
                // I don't want any car to move
                continue;
            }
            car.move();
            for (Car otherCar : cars) {
                if (car == otherCar) {
                    // I don't want to compare a car with itself
                    continue;
                }

                if (car.getPos().comparePositions(otherCar.getPos())) {
                    // crash && burn
                    car.crash();
                    otherCar.crash();
                    break;
                }
            }*/
        }
    }

}
