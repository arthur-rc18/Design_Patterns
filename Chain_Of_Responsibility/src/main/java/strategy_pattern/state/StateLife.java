package strategy_pattern.state;

import strategy_pattern.personagens.Personagem;

public abstract class StateLife {
    private Personagem personagem;
    private int sizeLife;

    public StateLife(Personagem personagem){
        this.personagem = personagem;
    }

    public void gainLife(int sizeLife){
        this.personagem.setLife(this.personagem.getLife() + sizeLife);
    }

    public void lostLife(int sizeLife){
        this.personagem.setLife(this.personagem.getLife() - sizeLife);
    }

}
