package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

public class Heal extends AbstractAbility {

    public Heal() {
        super(100);
    }

    @Override
    public void use(Hero user, Hero target) {
        if (user.health < 200) {
            int healAmount = Math.min(75, 200 - user.health);
            user.health += healAmount;
            System.out.println(user.name + " healed in " + healAmount + " life points.");
        }
    }
}