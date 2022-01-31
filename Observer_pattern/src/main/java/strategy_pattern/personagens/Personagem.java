package strategy_pattern.personagens;

import strategy_pattern.concrete_state.DangerLife;
import strategy_pattern.concrete_state.NormalLife;
import strategy_pattern.concrete_state.StrongLife;
import strategy_pattern.observers.Enemy;
import strategy_pattern.state.StateLife;
import strategy_pattern.strategy.Ataque;
import strategy_pattern.strategy.Correr;
import strategy_pattern.strategy.Pular;

import java.util.ArrayList;

public class Personagem {

    private Ataque a;
    private Pular p;
    private Correr c;
    private StateLife state;
    private int life;
    private int x;
    private int y;
    private ArrayList enemies = new ArrayList();


    public Personagem(int life){
        if (this.life >= 30 && this.life <= 70){
            new NormalLife(this);
        } else if(this.life > 70){
            new StrongLife(this);
        } else if(this.life > 0 && this.life < 30){
            new DangerLife(this);
        } else {
            System.out.println("Player is dead\n");
        }
        this.state = new NormalLife(this);
    }

    public Personagem() {
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void gainLife(int sizelife){
        state.gainLife(sizelife);
    }

    public void lostLife(int sizelife){
        state.lostLife(sizelife);
    }

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

    public void addEnemie(Enemy e){
        enemies.add(e);
    }

    public void removeEnemie(Enemy e){
        enemies.remove(e);
    }

    public void atack(Enemy e, int ataque){
        if(e.getX()  == this.getX() && e.getY() == this.getY())
            e.setLife(e.getLife() - ataque);
            if(e.getLife() == 0)
                enemies.remove(e);
    }
}
