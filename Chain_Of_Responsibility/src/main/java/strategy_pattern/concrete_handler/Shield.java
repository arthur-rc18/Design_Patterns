package strategy_pattern.concrete_handler;

import strategy_pattern.handler.Defence;
import strategy_pattern.personagens.Personagem;

public class Shield extends Defence {

    private int shield;
    private Personagem p;


    public Shield(int shield){
        this.shield = shield;
    }

    @Override
    public void shield(int damage) {
        int rest = damage - shield;

        if(rest < 0)
            p.setLife(p.getLife() - rest);
    }
}
