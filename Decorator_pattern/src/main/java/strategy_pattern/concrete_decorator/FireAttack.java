package strategy_pattern.concrete_decorator;

import strategy_pattern.decorator.AttackDecorator;
import strategy_pattern.strategy.Ataque;

public class FireAttack extends AttackDecorator {
    public FireAttack(Ataque attack) {
        super(attack);
        setDamage(85);
    }
}
