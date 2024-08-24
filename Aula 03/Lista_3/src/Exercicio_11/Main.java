package Exercicio_11;

public class Main {
    public static void main(String[] args) {
        Cidade toledo = new Cidade("toledo", 100000, "PR");

        toledo.diminuir_populacao();
        toledo.aumentar_populacao();

        System.out.println(toledo);
    }
}