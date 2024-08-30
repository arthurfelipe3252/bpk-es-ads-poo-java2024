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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa != null) {
            this.placa = placa;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor != null) {
            this.cor = cor;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        } else {
            System.out.println("Erro ao setar variavel");
        }
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
