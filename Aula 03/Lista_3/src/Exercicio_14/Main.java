package Exercicio_14;

public class Main {
    public static void main(String[] args) {
        Time time = new Time("Palmeiras", "Abel", 15);

        time.aumentar_jogadores();
        time.diminuir_jogadores();

        System.out.println(time);
    }
}
