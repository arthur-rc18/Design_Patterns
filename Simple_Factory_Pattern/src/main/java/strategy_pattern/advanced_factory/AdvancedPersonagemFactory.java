package strategy_pattern.advanced_factory;

import strategy_pattern.concrete_decorator.FireAttack;
import strategy_pattern.concrete_decorator.PoisonAttack;
import strategy_pattern.concrete_decorator.ThunderAttack;
import strategy_pattern.concrete_strategy.Forte;
import strategy_pattern.concrete_strategy.Fraco;
import strategy_pattern.concrete_strategy.MedioF;
import strategy_pattern.personagens.Personagem;

public class AdvancedPersonagemFactory {

    public static Personagem createPersonagem(){

        double type = Math.random();

        Personagem personagem = new Personagem();

        if(type <= 0.2){
            personagem.setAtaque(new PoisonAttack(new Forte()));
        } else if(type > 0.2 && type <= 0.4){
            personagem.setAtaque(new ThunderAttack(new Fraco()));
        } else if(type > 0.4 && type <= 0.6){
            personagem.setAtaque(new FireAttack(new MedioF()));
        } else if(type > 0.6 && type <= 0.8){
            personagem.setAtaque(new ThunderAttack(new Forte()));
        } else if(type <= 1.0){
            personagem.setAtaque(new FireAttack(new Fraco()));
        }

        return personagem;
    }
}
