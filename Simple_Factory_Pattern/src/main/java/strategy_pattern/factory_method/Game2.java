package strategy_pattern.factory_method;

import strategy_pattern.observers.Enemy;
import strategy_pattern.personagens.Personagem;

public abstract class Game2 {

    public abstract Personagem createPersonagem(int type);
    public abstract Enemy createEnemy(int type);

    public void jogar(){
        Personagem p1 = createPersonagem(1);
        Personagem p2 = createPersonagem(2);
        Enemy e1 = createEnemy(1);
        Enemy e2 = createEnemy(2);

        p1.correr();
        p1.attack(e1,35);
    }
}
