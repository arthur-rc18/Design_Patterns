package ataque;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AtaqueFactory {
    private static AtaqueFactory instancia = null;

    private AtaqueFactory() {
    }

    public static synchronized AtaqueFactory getInstancia() {
        if (instancia == null) {
            instancia = new AtaqueFactory();
        }
        return instancia;
    }

    public static Ataque geraAtaqueAleatorio() {
        List<Ataque> ataques = Arrays.asList(new AtaqueFraco(), new AtaqueMedio(), new AtaqueForte());
        int index = new Random().nextInt(ataques.toArray().length);

        return ataques.get(index);
    }
}
