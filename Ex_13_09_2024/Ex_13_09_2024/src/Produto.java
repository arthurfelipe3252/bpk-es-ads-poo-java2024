public class Produto {
    private String nome;
    private double valor;
    private int estoque;

    Produto(String nome, double valor, int estoque) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void alterarEstoque(int quantidade) {
        if (quantidade > estoque) {
            System.out.println("Estoque insuficiente.");
        } else {
            this.estoque -= quantidade;
        }
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

}
