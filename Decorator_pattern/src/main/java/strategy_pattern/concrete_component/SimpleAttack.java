package strategy_pattern.concrete_component;

import strategy_pattern.strategy.Ataque;

public class SimpleAttack extends Ataque {

    public SimpleAttack(){
        this.setDamage(75);
    }


    @Override
    public void atacar() {}
}
