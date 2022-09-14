import com.personagens.Inimigo;

import java.util.ArrayList;

public interface Component {

    public void criarFase(ArrayList<Inimigo> inimigos, double rand, String fase, Component c1, Component c2);
}
