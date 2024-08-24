package Exercicio_5;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 10, "Pincher");
        cachorro.latir();
        cachorro.correr();
        System.out.println(cachorro);
    }
}
