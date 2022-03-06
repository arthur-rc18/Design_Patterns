package strategy_pattern.factory_method;

import strategy_pattern.concrete_strategy.*;
import strategy_pattern.observers.Enemy;
import strategy_pattern.personagens.Personagem;

public class SimpleGame extends Game{
    @Override
    public Personagem createPersonagem(int type) {
        Personagem p = new Personagem();

        if(type == 1){
            p.setLife(100);
            p.setAtaque(new Fraco());
            p.setCorrer(new Rapido());
            p.setPular(new MedioP());
        } else if(type == 2){
                p.setLife(80);
                p.setAtaque(new Forte());
                p.setCorrer(new Devagar());
                p.setPular(new MedioP());
        }
        return p;
    }

    @Override
    public Enemy createEnemy(int type) {
        Enemy e = new Enemy();

        if(type == 1){
            e.setLife(100);
            e.setAtaque(new Fraco());
            e.setCorrer(new Rapido());
            e.setPular(new MedioP());
        } else if(type == 2){
            e.setLife(80);
            e.setAtaque(new Forte());
            e.setCorrer(new Devagar());
            e.setPular(new MedioP());
        }
        return e;
    }
}
