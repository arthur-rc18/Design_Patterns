package strategy_pattern.personagens;

import strategy_pattern.concrete_strategy.Forte;
import strategy_pattern.concrete_strategy.MedioC;
import strategy_pattern.concrete_strategy.MedioP;

public class Personagem1 extends Personagem{

    public Personagem1(){
        setPular(new MedioP());
        setCorrer(new MedioC());
        setAtaque(new Forte());
    }
}
