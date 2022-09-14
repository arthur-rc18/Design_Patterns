import com.personagens.Inimigo;

import java.util.ArrayList;

public class CriaSala implements Component{

    private ArrayList<Inimigo> inimigos;

    public void criarFase(ArrayList<Inimigo> inimigos, double rand, String fase, Component c1, Component c2 ){

        rand = Math.random();
        Inimigo enemy = null;

        if(inimigos.isEmpty()){
            if(rand < 0.5){
                newFase();
            }
            else
                newFase();
        }
    }

    public Component newFase(){
        return new Component() {
            @Override
            public void criarFase(ArrayList<Inimigo> inimigos, double rand, String fase, Component c1, Component c2) {

            }
        };
    }

}
