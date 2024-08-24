package Exercicio_10;

public class Veiculo {
    private String placa;
    private String tipo;
    private String cor;

    public Veiculo(String placa, String tipo, String cor) {
        this.placa = placa;
        this.tipo = tipo;
        this.cor = cor;
    }

    public void abastecer(){
        System.out.println("\nVeiculo abastecido");
    }

    public void lavar_carro(){
        System.out.println("\nVeiculo lavado");
    }

    @Override
    public String toString() {
        return "\nVeiculo: " + placa + ", " + tipo + ", " + cor + "\n";
    }
}
