package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

abstract public class Car {


    private String brand;

    private int velocity;

    /**
     * The position of the car on the grid
     */
    private Position pos;

    private boolean crashed;

    private Direction direction;

    public Car(String brand, int velocity, Position pos) {
        this.brand = brand;
        this.velocity = velocity;
        this.pos = pos;
        this.crashed = false;
        this.direction = Direction.values()[(int) (Math.random() * Direction.values().length)];
    }

    public void move() {

        // 20% chance to change direction
        if (Math.random() > 0.8) {
            this.direction = Direction.values()[(int) (Math.random() * Direction.values().length)];
        }

        switch (this.direction) {
            case RIGHT:
                pos.moveRight();
                break;
            case LEFT:
                pos.moveLeft();
                break;
            case UP:
                pos.moveUp();
                break;
            case DOWN:
                pos.moveDown();
                break;
        }
    }

    public void moveAndCheck(Car[] cars) {
        for (int i = 0; i < velocity; i++) {
            if (isCrashed()) {
                break;
            }

            move(); // this is the logical move

            for (Car car : cars) {
                if (this == car) {
                    continue;
                }
                if (this.pos.equals(car.getPos())) {
                    this.crash();
                    car.crash();
                    break;
                }
            }
        }
    }

    public void checkCollision() {

    }

    public void crash() {
        this.crashed = true;
    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return this.crashed;
    }

    @Override
    public String toString() {
        return this.crashed ? "C" : this.brand;
    }
}
