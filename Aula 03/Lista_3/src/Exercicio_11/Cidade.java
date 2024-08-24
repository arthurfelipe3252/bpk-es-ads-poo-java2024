package Exercicio_11;

import java.util.Scanner;

public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentar_populacao() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade para aumentar: ");
        int num = sc.nextInt();

        populacao += num;
    }

    public void diminuir_populacao() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade para diminuir: ");
        int num = sc.nextInt();

        if (num > populacao) {
            System.out.println("Numero maior que população.");
        } else {
            populacao -= num;
        }
    }

    @Override
    public String toString() {
        return nome + " " + populacao + " " + estado;
    }
}
