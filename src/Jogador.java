import java.util.List;
import java.util.Scanner;

public class Jogador {
    public String nome;
    private List<Carta> cartas;

    public Jogador(String nome, List<Carta> cartas){
        this.nome = nome;
        this.cartas = cartas;
    }

    public Carta escolheCarta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Suas cartas:");
        for (int i = 0; i < cartas.size(); i++){
            System.out.println(i + ": " + cartas.get(i));
        }
        System.out.println("Escolha uma carta pelo número:");
        int escolha = scanner.nextInt();

        while(escolha < 0 || escolha >= cartas.size()){
            System.out.println("Escolha inválida. Tente novamente:");
            escolha = scanner.nextInt();
        }
        return cartas.remove(escolha);
    }
}