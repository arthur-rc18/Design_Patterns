package strategy_pattern.concrete_decorator;

import strategy_pattern.decorator.AttackDecorator;
import strategy_pattern.strategy.Ataque;

public class TunderAttack extends AttackDecorator {
    public TunderAttack(Ataque attack) {
        super(attack);
        setDamage(50);
    }
}
