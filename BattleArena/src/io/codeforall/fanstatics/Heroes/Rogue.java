package io.codeforall.fanstatics.Heroes;

public class Rogue extends Hero {
    public Rogue(int health, int mana, int attack, int defense, String name, int ability) {
        super(health, mana, attack, defense, name, ability);

        Rogue rogue = new Rogue(health, mana, attack, defense, name, ability);
        this.health = 200;
        this.mana = 100;
        this.attack = 75;
        this.defense = 75;
        this.name = "Savage";
        this.ability = 120;

    }
}