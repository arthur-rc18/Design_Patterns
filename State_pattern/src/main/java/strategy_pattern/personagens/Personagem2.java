package strategy_pattern.personagens;

import strategy_pattern.concrete_strategy.Alto;
import strategy_pattern.concrete_strategy.MedioF;
import strategy_pattern.concrete_strategy.Rapido;

public class Personagem2 extends Personagem{

    public Personagem2(){
        setPular(new Alto());
        setCorrer(new Rapido());
        setAtaque(new MedioF());
    }
}
