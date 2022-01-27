package strategy_pattern;


import strategy_pattern.concrete_strategy.Devagar;
import strategy_pattern.concrete_strategy.Fraco;
import strategy_pattern.personagens.Personagem;
import strategy_pattern.personagens.Personagem1;

public class Main {

    public static void main(String[] args) {
        Personagem1 p = new Personagem1();

        p.atacar();
        p.pular();

        System.out.println(p);

        p.setAtaque(new Fraco());
        p.setCorrer(new Devagar());

        Personagem p1 = new Personagem(50);
        p1.gainLife(20);

    }




}
