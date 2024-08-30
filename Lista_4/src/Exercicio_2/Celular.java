package Exercicio_2;

public class Celular {
    private String marca;
    private String modelo;
    private String capacidadeBat;

    void ligar(){
        System.out.println("Ligando...");
        System.out.println("Exercicio_2.Celular ligado.");

    }

    void desligar(){
        System.out.println("desligano...");
        System.out.println("Exercicio_2.Celular desligado.");

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCapacidadeBat() {
        return capacidadeBat;
    }

    public void setMarca(String marca) {
        if (marca != null) {
            this.marca = marca;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public void setModelo(String modelo) {
        if (modelo != null) {
            this.modelo = modelo;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public void setCapacidadeBat(String capacidadeBat) {
        if (capacidadeBat != null) {
            this.capacidadeBat = capacidadeBat;
        } else {
            System.out.println("Erro ao setar variavel");
        }
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
