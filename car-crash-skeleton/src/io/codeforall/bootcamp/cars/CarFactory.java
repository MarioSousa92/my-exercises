package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

public abstract class CarFactory {

    public static Car getNewCar() {
        Position carPos = new Position();
        Car car = new Mustang(carPos);

        if (Math.random() < 0.8) {
            car = new Fiat(carPos);
        }

        return car;
    }

}