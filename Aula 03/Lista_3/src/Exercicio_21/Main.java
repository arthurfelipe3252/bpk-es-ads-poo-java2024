package Exercicio_21;

public class Main {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("bla bla", 18, "preto");

        cozinha.cozinhar();
        cozinha.limpar();

        System.out.println(cozinha);
    }
}
