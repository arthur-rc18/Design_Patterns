package strategy_pattern.concrete_state;

import strategy_pattern.concrete_strategy.Devagar;
import strategy_pattern.concrete_strategy.Fraco;
import strategy_pattern.personagens.Personagem;
import strategy_pattern.state.StateLife;

public class DangerLife extends StateLife {
    public DangerLife(Personagem personagem) {
        super(personagem);
        personagem.setAtaque(new Fraco());
        personagem.setCorrer(new Devagar());
    }
}
