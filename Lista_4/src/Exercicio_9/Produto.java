package Exercicio_9;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade_estoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        if (quantidade_estoque < 0) {
            this.quantidade_estoque = quantidade_estoque;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public Produto(String nome, double preco, int quantidade_estoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade_estoque = quantidade_estoque;
    }

    public void aumentar_estoque(){
        quantidade_estoque++;
        System.out.println("Estoque atualizado com sucesso: " + quantidade_estoque);
    }

    public void diminuir_estoque(){
        quantidade_estoque--;
        System.out.println("Estoque atualizado com sucesso: " + quantidade_estoque);
    }

    @Override

    public String toString() {
        return nome + " - " + preco + " - " + quantidade_estoque;
    }
}
