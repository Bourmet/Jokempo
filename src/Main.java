import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Jokmon j1 = new Jokmon();
        System.out.println("Digite o nome do jogador:");
        j1.Nome = scanner.nextLine();
        System.out.println("Escolha sua jogada (0: Pedra, 1: Papel, 2: Tesoura):");
        j1.lance = scanner.nextInt();
            while(j1.lance < 0|| j1.lance > 2){
                System.out.println("Apenas entre esses. Escolha sua jogada (0: Pedra, 1: Papel, 2: Tesoura):");
                j1.lance = scanner.nextInt();
            }
        j1.jogar();

        Inimigo i1 = new Inimigo();
        i1.jogar();
    
        String resultado = calculo(j1.lance, i1.lanceInimigo);
            System.out.println(resultado);

        scanner.close();
    }

    public static String calculo(int lanceJogagor, int lanceIni){
        if (lanceJogagor == lanceIni){
            return "Empate!";
        } else if (
            (lanceJogagor == 0 && lanceIni == 2)||
            (lanceJogagor == 1 && lanceIni == 0)||
            (lanceJogagor == 2 && lanceIni == 1)) {
            return "Venceu";
        } else {
            return "Você Perdeu";
        }
    }
}
