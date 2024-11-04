package io.codeforall.fanstatics.Heroes;

import javax.lang.model.element.Name;

public class Warrior extends Hero {
    public Warrior(int health, int mana, int attack, int defense, String name, int ability) {
        super(health, mana, attack, defense, name, ability);

        Warrior warrior = new Warrior(health, mana, attack, defense, name, ability);
        this.health = 200;
        this.mana = 100;
        this.attack = 65;
        this.defense = 85;
        this.name = "Baba";
        this.ability = 100;

    }
}
