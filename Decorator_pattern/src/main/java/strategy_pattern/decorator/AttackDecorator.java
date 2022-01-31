package strategy_pattern.decorator;

import strategy_pattern.strategy.Ataque;

public abstract class AttackDecorator extends Ataque {

    public Ataque attack;

    public AttackDecorator(Ataque attack){
        this.attack = attack;
    }

    @Override
    public void atacar() {}

    @Override
    public double getDamage() {
        return attack.getDamage() + super.getDamage();
    }
}
