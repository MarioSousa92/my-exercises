package io.codeforall.fanstatics.Heroes;

import io.codeforall.fanstatics.Abilities.*;

public abstract class Hero {
    public int health;
    public int mana;
    public int attack;
    public int defense;
    public String name;
    public int ability;
    public int abilityPower;

    public Hero(int health, int mana, int attack, int defense, String name, int ability, int abilityPower) {
        this.health = health;
        this.mana = mana;
        this.attack = attack;
        this.defense = defense;
        this.name = name;
        this.ability = ability;
        this.abilityPower = abilityPower;
    }

    public void strike(Hero target) {
        int damage = Math.max(0, this.attack - target.defense);
        target.health -= damage;
        System.out.println(this.name + " attacked " + target.name + " and caused " + damage + " of damage.");
    }

    public boolean canUseAbility() {
        return mana >= abilityPower;
    }

    public void useAbility(Hero target) {
        int damage = Math.max(0, this.attack - target.defense);
        target.health -= damage;
            if (canUseAbility()) {
            mana -= abilityPower;
            System.out.println(this.name + " used the ability " + ability + " on " + target.name + " .");
        }
    }
}