package io.codeforall.fanstatics.Heroes;

public abstract class Hero {
    public int health;
    public int mana;
    public int attack;
    public int defense;
    public String name;
    public int ability;

    public Hero(int health, int mana, int attack, int defense, String name, int ability) {
        this.health = health;
        this.mana = mana;
        this.attack = attack;
        this.defense = defense;
        this.name = name;
        this.ability = ability;

    }
}