package Exercicio_16;

import java.util.Scanner;

public class Loja {
    private String nome;
    private String telefone;
    private String endereco;

    public Loja(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void abrir(){
        System.out.println("Item 1: R$19,90");
        System.out.println("Item 2: R$50,00");
        System.out.println("Item 3: R$24,99");
        System.out.println("Item 4: R$10,00");
        System.out.println("Item 5: R$100,00");
        System.out.println("Item 6: R$200,00");
        System.out.println("Item 7: R$300,00");
        System.out.println("Item 8: R$400,00");
        System.out.println("Item 9: R$500,00");
        System.out.println("Item 10: R$600,00");

        System.out.println("Insira qualquer numero para sair.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        fechar();
    }

    public void fechar(){
        System.out.println("Fechando loja.....");
    }

    @Override

    public String toString() {
        return nome + " " + telefone + " " + endereco;
    }
}
