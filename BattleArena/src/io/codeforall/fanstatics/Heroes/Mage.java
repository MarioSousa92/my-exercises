package io.codeforall.fanstatics.Heroes;

public class Mage extends Hero {
    public Mage(int health, int mana, int attack, int defense, String name, int ability) {
        super(health, mana, attack, defense, name, ability);

        Mage mage = new Mage(health, mana, attack, defense, name, ability);
        this.health = 200;
        this.mana = 100;
        this.attack = 100;
        this.defense = 50;
        this.name = "Merlin";
        this.ability = 140;


    }
}
