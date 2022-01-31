package strategy_pattern;


import strategy_pattern.concrete_component.SimpleAttack;
import strategy_pattern.concrete_decorator.FireAttack;
import strategy_pattern.concrete_decorator.PoisonAttack;
import strategy_pattern.concrete_decorator.TunderAttack;
import strategy_pattern.concrete_handler.Shield;
import strategy_pattern.concrete_strategy.Devagar;
import strategy_pattern.concrete_strategy.Fraco;
import strategy_pattern.handler.Defence;
import strategy_pattern.personagens.Personagem;
import strategy_pattern.personagens.Personagem1;
import strategy_pattern.strategy.Ataque;

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

        Defence d1 = new Shield(100);
        Defence d2 = new Shield(200);

        d1.setNext(d2);
        d2.setNext(null);

        d1.shield(50);
        d1.shield(100);

        Ataque attack;
        attack = new SimpleAttack();
        attack = new FireAttack(attack);
        attack = new TunderAttack(attack);
        attack = new PoisonAttack(attack);

        System.out.println(attack.getDamage());
    }
}