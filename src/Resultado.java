public class Resultado {
    public static String calcular(Carta cartaJogador, Carta cartaInimigo){
        if(cartaJogador.getNaipe() == cartaInimigo.getNaipe()){
            if (cartaJogador.getValorCarta() > cartaInimigo.getValorCarta()){
                return "Você venceu! " + cartaJogador.getValorCarta() + " VS " + cartaInimigo.getValorCarta();
            }else{
                return "Você perdeu... " + cartaJogador.getValorCarta() + " VS " + cartaInimigo.getValorCarta();
            }
        }

        boolean venceu = (cartaJogador.getNaipe() == "Pedra" && cartaInimigo.getNaipe() == "Tesoura")||
        (cartaJogador.getNaipe() == "Papel" && cartaInimigo.getNaipe() == "Pedra") ||
        (cartaJogador.getNaipe() == "Tesoura" && cartaInimigo.getNaipe() == "Papel");

        if(venceu){
            int pontuacaoJogador = cartaJogador.getValorCarta()*3;
            if(pontuacaoJogador > cartaInimigo.getValorCarta()){
                return "Você venceu!" + pontuacaoJogador + "vence " + cartaInimigo.getValorCarta();    
            }else if(pontuacaoJogador == cartaInimigo.getValorCarta()){
                return "O jogo empatou";
            }else {
                return "Você perdeu..." + pontuacaoJogador + "perde para " + cartaInimigo.getValorCarta();
            }
        }else{
            int pontuacaoInimigo = cartaInimigo.getValorCarta()*3;
            if(pontuacaoInimigo > cartaJogador.getValorCarta()){
                return "Você perdeu... " + pontuacaoInimigo + "vence " + cartaJogador.getValorCarta();
            }else if(pontuacaoInimigo == cartaInimigo.getValorCarta()){
                return "O jogo empatou";
            }else {
                return "Você ganhou! " + pontuacaoInimigo + "perde para " + cartaJogador.getValorCarta(); 
            }
        }   
    }
}