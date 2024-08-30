package Exercicio_10;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("AKH-0889", "320i", "Preto");

        veiculo.abastecer();
        veiculo.lavar_carro();

        System.out.println(veiculo);
    }
}
