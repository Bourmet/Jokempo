import java.util.List;
import java.util.Random;

public class Inimigo {
    private List<Carta> cartas;

    public Inimigo(List<Carta> cartas){
        this.cartas = cartas;
    }
    public Carta jogar(){
        Random random = new Random();
        int escolha = random.nextInt(cartas.size());
        return cartas.remove(escolha);
    }
    
}
 