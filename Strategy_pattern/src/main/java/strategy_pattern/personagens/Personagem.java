package strategy_pattern.personagens;

import strategy_pattern.strategy.Ataque;
import strategy_pattern.strategy.Correr;
import strategy_pattern.strategy.Pular;

public class Personagem {

    private Ataque a;
    private Pular p;
    private Correr c;

    public void setAtaque(Ataque a) {
        this.a = a;
    }

    public void setPular(Pular p) {
        this.p = p;
    }

    public void setCorrer(Correr c) {
        this.c = c;
    }

    public void pular(){
        p.pular();
    }

    public void correr(){
        c.correr();
    }

    public void atacar(){
        a.atacar();
        System.out.println("Esta atacando");
    }
}
