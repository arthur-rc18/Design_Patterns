package strategy_pattern.concrete_decorator;

import strategy_pattern.decorator.AttackDecorator;
import strategy_pattern.strategy.Ataque;

public class PoisonAttack extends AttackDecorator {
    public PoisonAttack(Ataque attack) {
        super(attack);
        setDamage(75);
    }
}
