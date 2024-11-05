package io.codeforall.fanstatics.Abilities;

public abstract class AbstractAbility implements Ability {

    public int manaCost;

    AbstractAbility(int manaCost) {
        this.manaCost = manaCost;
    }
}