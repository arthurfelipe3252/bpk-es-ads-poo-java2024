package Exercicio_20;

public class Bicicleta {
    private String modelo;
    private String marca;
    private int tamanho_roda;

    public Bicicleta(String modelo, String marca, int tamanho_roda) {
        this.modelo = modelo;
        this.marca = marca;
        this.tamanho_roda = tamanho_roda;
    }

    public void pedalar(){
        System.out.println("Pedalando....");
    }

    public void frear(){
        System.out.println("Freando....");
    }

    @Override
    public String toString() {
        return modelo + " - " + marca + " - " + tamanho_roda;
    }
}
