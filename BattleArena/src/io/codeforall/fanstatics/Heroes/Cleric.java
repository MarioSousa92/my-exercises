package io.codeforall.fanstatics.Heroes;

public class Cleric extends Hero {
    public Cleric(int health, int mana, int attack, int defense, String name, int ability) {
        super(health, mana, attack, defense, name, ability);

        Cleric cleric = new Cleric(health, mana, attack, defense, name, ability);
        this.health = 200;
        this.mana = 100;
        this.attack = 50;
        this.defense = 100;
        this.name = "Pope";
        this.ability = 75;


    }
}