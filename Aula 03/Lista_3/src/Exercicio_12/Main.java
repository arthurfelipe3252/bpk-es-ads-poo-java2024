package Exercicio_12;

public class Main {
    public static void main(String[] args) {
        Filme film = new Filme("transformers", "michael bay", "2 H");

        film.iniciar();
        film.parar();

        System.out.println(film);
    }
}
