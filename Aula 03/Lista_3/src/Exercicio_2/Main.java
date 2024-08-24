package Exercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Celular Iphone = new Celular("Aplle", "Iphone 15 Pro Max", "1000KW");

        Iphone.ligar();

        System.out.println(Iphone);

        Iphone.desligar();

        return;
    }
}
