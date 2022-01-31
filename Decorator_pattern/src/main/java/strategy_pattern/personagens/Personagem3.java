package strategy_pattern.personagens;

import strategy_pattern.concrete_strategy.Baixo;
import strategy_pattern.concrete_strategy.Forte;
import strategy_pattern.concrete_strategy.Rapido;

public class Personagem3 extends Personagem{

    public Personagem3(){
        setPular(new Baixo());
        setCorrer(new Rapido());
        setAtaque(new Forte());
    }
}
