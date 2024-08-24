package Exercicio_2;

public class Celular {
    public String marca;
    public String modelo;
    public String capacidadeBat;

    void ligar(){
        System.out.println("Ligando...");
        System.out.println("Exercicio_2.Celular ligado.");

    }

    void desligar(){
        System.out.println("desligano...");
        System.out.println("Exercicio_2.Celular desligado.");

    }

    public Celular(String marca, String modelo, String capacidadeBat) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBat = capacidadeBat;
    }

    @Override
    public String toString() {
        return marca + " - " + modelo + " - " + capacidadeBat;
    }
}
