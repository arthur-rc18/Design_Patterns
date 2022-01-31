package strategy_pattern.observers;

import strategy_pattern.personagens.Personagem;

import java.util.Observable;
import java.util.Observer;

public class Enemy extends Personagem implements Observer {
    private Personagem p1 ;
    private Enemy e1;

    public Enemy(){}

    public Enemy(int x, int y, String nome){
    }

    public void ataca(Personagem p1, int ataque){
        p1.setLife(p1.getLife() - ataque);
    }

    public void distAtaca(Enemy e, Personagem p, int ataque){
        if(e.getX() == p.getX() && e.getY() == p.getY()){
            e.ataca(p,ataque);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        p1 = (Personagem)o;

        if(this.getX() < p1.getX() && this.getY() < p1.getY()){
            this.setX(p1.getX());
            this.setY(p1.getY());
        }

    }
}
