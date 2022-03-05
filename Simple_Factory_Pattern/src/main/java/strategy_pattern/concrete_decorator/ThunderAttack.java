package strategy_pattern.concrete_decorator;

import strategy_pattern.decorator.AttackDecorator;
import strategy_pattern.strategy.Ataque;

public class ThunderAttack extends AttackDecorator {
    public ThunderAttack(Ataque attack) {
        super(attack);
        setDamage(50);
    }
}
