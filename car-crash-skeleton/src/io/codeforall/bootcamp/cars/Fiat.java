package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

public class Fiat extends Car {

    public Fiat(Position position) { // construtor do Fiat com a velocidade definida
        super ("F", 1, position);
    }

    /*@Override // metodo para os carros se moverem conforme a velocidade definida
    public void move() {
        Object position;           //        criar uma variavel local para resolver erro na "position"
        //position.moveHorizontal(velocity);
        //position.moveVertical(velocity);
    }*/
}