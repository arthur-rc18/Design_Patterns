package strategy_pattern;


import strategy_pattern.concrete_strategy.Devagar;
import strategy_pattern.concrete_strategy.Fraco;
import strategy_pattern.personagens.Personagem;
import strategy_pattern.personagens.Personagem1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Personagem1 p = new Personagem1();

        p.atacar();
        p.pular();

        System.out.println(p);

        p.setAtaque(new Fraco());
        p.setCorrer(new Devagar());

        Personagem p1 = new Personagem(50,50,50,"Warrior");
        p1.gainLife(20);
        p1.gainLife(30);
        p1.lostLife(70);

        Game g = new Game();
        g.play(g);

    }




}
