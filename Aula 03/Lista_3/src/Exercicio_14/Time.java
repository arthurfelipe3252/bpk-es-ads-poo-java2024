package Exercicio_14;

import java.util.Scanner;

public class Time {
    private String nome;
    private String tecnico;
    private int jogadores;

    public Time(String nome, String tecnico, int jogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = jogadores;
    }

    public void aumentar_jogadores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero para aumentar: ");
        int num = sc.nextInt();

        jogadores += num;
    }

    public void diminuir_jogadores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero para diminuir: ");
        int num = sc.nextInt();

       if (num > jogadores) {
           System.out.println("Numero maior que jogadores");
       } else {
           jogadores -= num;
       }
    }

    @Override
    public String toString() {
        return nome + " " + jogadores + " " + tecnico;
    }
}
