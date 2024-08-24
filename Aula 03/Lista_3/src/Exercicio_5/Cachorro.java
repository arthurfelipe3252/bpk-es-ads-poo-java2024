package Exercicio_5;

public class Cachorro {
    public   String nome;
    public  int idade;
    public  String raca;

    public Cachorro(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public void latir(){
        System.out.println("Au Au Au Au Au Au Au");
    }

    public void correr(){
        System.out.println("Correndo");
    }

    @Override
    public String toString() {
        return nome + " " + idade + " " + raca;
    }
}
