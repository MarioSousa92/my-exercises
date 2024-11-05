package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

public class SneakAttack extends AbstractAbility {

    public SneakAttack() {
        super(75);
    }

    @Override
    public void use(Hero user, Hero target) {
        int damage = 90;
        target.health -= damage;
        System.out.println(user.name + " carried out a sneak attack on " + target.name + " and caused " + damage + " of damage.");
    }
}