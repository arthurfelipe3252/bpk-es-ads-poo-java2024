package Exercicio_15;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("God of war", "Combate", 150.0);

        jogo.iniciar();
        jogo.pausar();

        System.out.println(jogo);
    }
}
