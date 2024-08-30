package Exercicio_9;

public class Main {
    public static void main(String[] args) {
        Produto prod = new Produto("carne", 15.90, 50);

        prod.aumentar_estoque();
        prod.diminuir_estoque();
        System.out.println(prod);
    }
}
