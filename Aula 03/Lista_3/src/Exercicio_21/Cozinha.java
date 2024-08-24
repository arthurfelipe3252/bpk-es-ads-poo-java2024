package Exercicio_21;

public class Cozinha {
    private String tipo;
    private int quant_pessoas;
    private String cor;

    public Cozinha(String tipo, int quant_pessoas, String cor) {
        this.tipo = tipo;
        this.quant_pessoas = quant_pessoas;
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("Cozinhando.....");
    }

    public void limpar() {
        System.out.println("Limpando.....");
    }

    @Override

    public String toString() {
        return tipo + " - " + quant_pessoas + " - " + cor;
    }

}
