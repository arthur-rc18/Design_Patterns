import com.personagens.Inimigo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Jogo jogo = null;
        ArrayList <Inimigo> inimigos = null;
        double rand = Double.parseDouble(null);
        String fase = null;
        Component c1 = null;
        Component c2 = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do personagem: ");
        String nome = scanner.nextLine();

        System.out.println("Selecione o tipo de jogo (1 - Estado.Normal / 2 - Avançado / 3 - Medieval / 4 - Futurista)");
        String gameType = scanner.nextLine();

        if (Objects.equals(gameType, "1")) {
            jogo = JogoSimples.getInstancia();
        } else if (Objects.equals(gameType, "2")) {
            jogo = JogoAvancado.getInstancia();
        } else if (Objects.equals(gameType, "3")) {
            jogo = JogoMedieval.getInstancia();
        } else if (Objects.equals(gameType, "4")) {
            jogo = JogoFuturista.getInstancia();
        } else {
            throw new Exception("Opção inválida!");
        }

        System.out.println("Selecione o tipo de personagem: ");
        int tipoDoPersonagem = Integer.parseInt(scanner.nextLine());

        Component c = null;

        try {
            c.criarFase(inimigos,rand,fase,c1,c2);
        } catch (NullPointerException e){
            e.printStackTrace();
        }


        jogo.jogar(nome, tipoDoPersonagem);
    }
}
