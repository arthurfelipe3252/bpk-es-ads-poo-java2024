package Exercicio_7;

import java.util.Scanner;

public class Aluno {
    public String nome;
    public int matricula;
    public String curso;

    public Aluno(String nome, int matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void calcular_media(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a nota 1:");
        float nota1 = scan.nextFloat();
        System.out.println("Informe a nota 2:");
        float nota2 = scan.nextFloat();
        System.out.println("Informe a nota 3:");
        float nota3 = scan.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.println(media);
    }

    @Override
    public String toString() {
        return nome + " - " + matricula + " - " + curso;
    }
}
