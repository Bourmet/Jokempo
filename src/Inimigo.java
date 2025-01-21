

public class Inimigo {
    public int lanceInimigo = (int)(Math.random()*3);

    public void jogar(){
        if (this.lanceInimigo == 0){
            System.out.println("inimigo: Pedra lançada");
        }
        else if (this.lanceInimigo == 1){
            System.out.println("inimigo: Papel lançado");
        }
        else if (this.lanceInimigo == 2){
            System.out.println("inimigo: Tesoura lançada");
        }
        else{
            System.out.println("Não tem outras opções");
        }
    }
    
}
