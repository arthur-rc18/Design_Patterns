package strategy_pattern.observers;

import strategy_pattern.personagens.Personagem;

public class Enemy extends Personagem{
    private Personagem p1 ;
    private Enemy e1;

    public Enemy(int x, int y, String nome){
        //super(x,y);
    }

    public void ataca(Personagem p1, int ataque){
        p1.setLife(p1.getLife() - ataque);
    }

    public void distAtaca(Enemy e, Personagem p, int ataque){
        if(e.getX() == p.getX() && e.getY() == p.getY()){
            e.ataca(p,ataque);
        }
    }
}
