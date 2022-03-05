package strategy_pattern.personagens;

import strategy_pattern.concrete_strategy.Alto;
import strategy_pattern.concrete_strategy.MedioF;
import strategy_pattern.concrete_strategy.Rapido;

public class Personagem5 extends Personagem{

    public Personagem5(){
        setPular(new Alto());
        setCorrer(new Rapido());
        setAtaque(new MedioF());
    }
}
