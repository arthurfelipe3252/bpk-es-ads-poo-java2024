import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Item> itens;
    private Entregador entregador;
    private F_pagamento formaPagamento;
    private double valor_total = 0;
    private double taxa_entrega = 10;

    public Pedido(Cliente cliente, F_pagamento formaPagamento, Entregador entregador) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.formaPagamento = formaPagamento;
        this.entregador = entregador;
    }

    public void incliuirItem(Item item) {
        itens.add(item);
    }

    private void calcular_valor(){
        for (Item item : itens) {
            valor_total += item.getValor_total();
        }
        valor_total += taxa_entrega;
    }

    public void printar(){
        System.out.println("Cliente: " + cliente);
        System.out.println("Endereço para entrega: " + cliente.get_endereco());
        System.out.println("Itens do Pedido:");
        for (Item item : itens) {
            System.out.println(item.toString());
        }

        calcular_valor();
        System.out.println("Valor: " + valor_total+taxa_entrega + "  Forma de Pagamento: " + formaPagamento);
        System.out.println("Entregador: "+ entregador);
    }
}
