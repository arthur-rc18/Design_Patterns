package strategy_pattern;


import strategy_pattern.personagens.Personagem1;

public class Main {

    public static void main(String[] args) {
        Personagem1 p = new Personagem1();

        p.atacar();
        p.pular();

        System.out.println(p);


    }




}
