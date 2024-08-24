package Exercicio_6;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador("I3", 20, "500 GB");
        computador.ligar();
        System.out.println(computador);
        computador.desligar();
    }
}
