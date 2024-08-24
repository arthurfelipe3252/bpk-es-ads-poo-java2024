package Exercicio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa("Arthur", 18, 1.80f);

        System.out.println("Ola, me chamo: "+ pessoa1.nome + ", tenho " + pessoa1.idade + " anos e " + pessoa1.altura + " de altura.");
        System.out.println("Tenho " + pessoa1.idade + " anos e " + pessoa1.altura + " de altura.");
        return;
    }
}
