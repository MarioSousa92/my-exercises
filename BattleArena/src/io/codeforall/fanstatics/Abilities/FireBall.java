package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

public class FireBall extends AbstractAbility {

    public FireBall() {
        super(100);
    }

    @Override
    public void use(Hero user, Hero target) {
        int damage = 140;
        target.health -= damage;
        System.out.println(user.name + " lanched a fireball at " + target.name + " and caused " + damage + " of damage.");
    }
}