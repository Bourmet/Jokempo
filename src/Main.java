import java.util.List;

public class Main {
    public static void main(String[] args){
        Baralho baralho = new Baralho();
        baralho.embaralhar();

        List<Carta> maoJogador = baralho.distribuirCartas(3);
        List<Carta> maoInimigo = baralho.distribuirCartas(3);
        
        Jogador jogador = new Jogador("Jogador", maoJogador);
        Inimigo inimigo = new Inimigo(maoInimigo);

        int vitoriasJogador = 0;
        int vitoriaInimigo = 0;
        int rounds = 1;

        while (vitoriasJogador < 2 && vitoriaInimigo < 2){

            Carta cartaJogador = jogador.escolheCarta();
            Carta cartaInimigo = inimigo.jogar();

            System.out.println("Jogador jogou: " + cartaJogador);
            System.out.println("Inimigo jogou: " + cartaInimigo);

            String resultado = Resultado.calcular(cartaJogador, cartaInimigo);
            System.out.println(resultado);
        
            if (resultado.contains("Você venceu!")){
                vitoriasJogador++;
            }else if(resultado.contains("Você perdeu... ")){
                vitoriaInimigo++;
            }
            rounds++;
        }

        if(vitoriasJogador == 2){
            System.out.println("\nVocê venceu o jogo em " + rounds);
        }else if(vitoriaInimigo ==2){
            System.out.println("\nVocê perdeu o jogo em " + rounds);
        }
    }
}
