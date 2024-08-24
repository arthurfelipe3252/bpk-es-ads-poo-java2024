package Exercicio_22;

import java.util.Scanner;

public class Empresa {
    private String nome;
    private String cnpj;
    private int numero_funcionarios;


    public Empresa(String nome, String cnpj, int numero_funcionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numero_funcionarios = numero_funcionarios;
    }

    public void contratar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero para contratar: ");
        int num = sc.nextInt();

        numero_funcionarios += num;
    }

    public void demitir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero para demitir: ");
        int num = sc.nextInt();

        if (num > numero_funcionarios) {
            System.out.println("Numero maior que funcionarios");
        } else {
            numero_funcionarios -= num;
        }
    }

    @Override

    public String toString() {
        return nome + " " + cnpj + " " + numero_funcionarios;
    }
}
