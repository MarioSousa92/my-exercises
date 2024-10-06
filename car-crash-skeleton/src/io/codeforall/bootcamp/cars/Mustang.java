package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

public class Mustang extends CarFactory {
    public Mustang (Position position) {
        super("Mustang", 2, position);
    }

    @Override
    public void move() {
        Object position;
        position.moveHorizontal(velocity);
        position.moveVertical(velocity);
    }
}
