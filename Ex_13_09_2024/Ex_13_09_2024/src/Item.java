import java.util.List;

public class Item {
    private int quantidade;
    private Produto produto;
    private double valor_total;

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.valor_total = produto.getValor() * quantidade;
        produto.alterarEstoque(quantidade);
    }

    public double getValor_total() {
        return valor_total;
    }

    @Override

    public String toString() {
        return produto.getNome() + " - " + produto.getValor() + ", Quantidade: " + quantidade + ", Subtotal: " + valor_total;
    }

}
