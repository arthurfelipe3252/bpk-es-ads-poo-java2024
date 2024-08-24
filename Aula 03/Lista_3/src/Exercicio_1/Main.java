package Exercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Livro liv = new Livro("Pequeno principe", "Leonardo da Vinci", 550);

            System.out.println("Deseja abrir a pag?");
            int abrir = scan.nextInt();

            if(abrir == 1){
                liv.abrir_livro();
            }

            System.out.println("Deseja ler a página?");
            abrir = scan.nextInt();
            if(abrir == 1){
                liv.ler();
            }

            return;

    }
}