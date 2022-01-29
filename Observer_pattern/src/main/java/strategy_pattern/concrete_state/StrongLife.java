package strategy_pattern.concrete_state;

import strategy_pattern.concrete_strategy.Forte;
import strategy_pattern.concrete_strategy.Rapido;
import strategy_pattern.personagens.Personagem;
import strategy_pattern.state.StateLife;

public class StrongLife extends StateLife {

    public StrongLife(Personagem personagem) {
        super(personagem);
        personagem.setAtaque(new Forte());
        personagem.setCorrer(new Rapido());
    }

}