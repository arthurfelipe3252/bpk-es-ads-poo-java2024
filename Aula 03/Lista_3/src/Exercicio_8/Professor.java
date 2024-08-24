package Exercicio_8;

public class Professor {
    public String nome;
    public String disciplina;
    public float salario;

    public Professor(String nome, String idade, float salario) {
        this.nome = nome;
        this.disciplina = idade;
        this.salario = salario;
    }

    public void dar_aula() {
        System.out.println("Lecionando aula......");
    }

    public void corrigindo_prova() {
        System.out.println("Corrigindo prova......");
    }

    @Override
    public String toString() {
        return nome + " " + disciplina + " " + salario;
    }
}
