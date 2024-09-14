public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Arthur", "11880986914", "459915198882");
        cliente1.incluirEndereco();

        Produto produto1 = new Produto("Carne", 150.00, 20);
        Produto produto2 = new Produto("Arroz", 30.00, 20);
        Produto produto3 = new Produto("Feijão", 25.00, 20);
        Produto produto4 = new Produto("Suco", 20.00, 20);

        Item item1 = new Item(3, produto1);
        Item item2 = new Item(2, produto2);
        Item item3 = new Item(2, produto3);
        Item item4 = new Item(1, produto4);

        Entregador entregador1 = new Entregador("Paulo", 25, "15612168965");

        Pedido pedido1 = new Pedido(cliente1, F_pagamento.PIX, entregador1);
        pedido1.incliuirItem(item1);
        pedido1.incliuirItem(item2);
        pedido1.incliuirItem(item3);
        pedido1.incliuirItem(item4);

        pedido1.printar();
    }
}