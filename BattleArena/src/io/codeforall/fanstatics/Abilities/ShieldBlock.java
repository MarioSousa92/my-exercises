package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

public class ShieldBlock extends AbstractAbility {

    public ShieldBlock() {

        super(100);
    }

    @Override
    public void use(Hero user, Hero target) {
        System.out.println(user.name + " used Shield Block to defend himself.");
    }
}