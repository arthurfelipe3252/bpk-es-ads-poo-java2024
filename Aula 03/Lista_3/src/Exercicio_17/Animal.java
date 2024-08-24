package Exercicio_17;

public class Animal {
    private String nome;
    private int idade;
    private String peso;

    public Animal(String nome, int idade, String peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void alimentar(){
        System.out.println("Alimentando " + nome);
    }

    public void dormir(){
        System.out.println( nome + " esta dormindo....");
    }

    @Override
    public String toString() {
        return nome + " " + idade + " " + peso;
    }
}
