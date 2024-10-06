package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

public abstract class  CarFactory {

    private String brand;
    private static Position position;
    public int velocity; //

    public CarFactory(String brand, int i, Position position) { // erro nas subclasses "super" que esta linha resolveu
    }

    public static  Car getNewCar(String brand, int velocity) {
        this.brand = brand;
        this.velocity = velocity;
        this.position = position;
    }

    public abstract void move(); // metodo de movimento para as subclasses

    public Position getPos{
        return position;
    }

    public String getBrand() {
        return brand;
    }
}