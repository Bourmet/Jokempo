public class Carta {
    //Atributos
    private String naipe;
    private int valorCarta;
    //Métodos
    public Carta(String naipe, int valorCarta){
        this.naipe = naipe;
        this.valorCarta = valorCarta;
    }


    public String getNaipe() {
        return naipe;
    }

    public int getValorCarta() {
        return valorCarta;
    }


    @Override
    public String toString(){
        return naipe + " " + valorCarta;
    }
}
