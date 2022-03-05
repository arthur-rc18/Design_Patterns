package strategy_pattern.simple_factory;

import strategy_pattern.personagens.*;

public class SimplePersonagemFactory {

    public static Personagem createPersonagem(){

        Personagem personagem = null;

        double type = Math.random();

        if(type <= 0.2){
            personagem = new Personagem1();
        } else if(type > 0.2 && type <= 0.4){
            personagem = new Personagem2();
        } else if(type > 0.4 && type <= 0.6){
            personagem = new Personagem3();
        } else if(type > 0.6 && type <= 0.8){
            personagem = new Personagem4();
        } else if(type > 0.8 && type <= 1.0) {
            personagem = new Personagem5();
        }
        return personagem;
    }

}