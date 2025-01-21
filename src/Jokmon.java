

public class Jokmon {
    public String Nome;
    public int lance;

    public void jogar(){
        if (this.lance == 0){
            System.out.println(Nome + " :Pedra lançada");
        }
        else if (this.lance == 1){
            System.out.println(Nome + " :Papel lançado");
        }
        else if (this.lance == 2){
            System.out.println(Nome + " :Tesoura lançada");
        }
        else{
            System.out.println("Não tem outras opções");
        }
    }
}