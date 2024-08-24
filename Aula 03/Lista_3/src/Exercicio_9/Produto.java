package Exercicio_9;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade_estoque;

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
