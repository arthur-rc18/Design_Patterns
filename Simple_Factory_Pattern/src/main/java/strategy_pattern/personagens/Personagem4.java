package strategy_pattern.personagens;

import strategy_pattern.concrete_strategy.Forte;
import strategy_pattern.concrete_strategy.MedioC;
import strategy_pattern.concrete_strategy.MedioP;

public class Personagem4 extends Personagem{

    public Personagem4(){
        setPular(new MedioP());
        setCorrer(new MedioC());
        setAtaque(new Forte());
    }
}
