import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;
    public Baralho(){
        cartas = new ArrayList<>();
        String[] naipes = {"Pedra", "Papel", "Tesoura"};

        for(String naipe : naipes){
            for(int valorCarta = 2; valorCarta <= 13; valorCarta++){
                cartas.add(new Carta(naipe, valorCarta));
            }
        }
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }
    
    public List<Carta> distribuirCartas(int quantidade){
        List<Carta> mao = new ArrayList<>();
        for (int i = 0; i < quantidade && !cartas.isEmpty(); i++){
            mao.add(cartas.remove(0));
        }
        return mao;
    }
}

