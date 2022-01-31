package strategy_pattern.concrete_state;

import strategy_pattern.concrete_strategy.MedioC;
import strategy_pattern.concrete_strategy.MedioF;
import strategy_pattern.personagens.Personagem;
import strategy_pattern.state.StateLife;

public class NormalLife extends StateLife {

    public NormalLife(Personagem personagem) {
        super(personagem);
        personagem.setAtaque(new MedioF());
        personagem.setCorrer(new MedioC());
    }

}