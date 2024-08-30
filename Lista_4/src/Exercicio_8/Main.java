package Exercicio_8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Jony", "Geografia", 50000);

        professor.corrigindo_prova();
        professor.dar_aula();

        System.out.println(professor);
    }
}
