package Exercicio_3;

public class Pessoa {
    public String nome;
    public int idade;
    public float altura;

    public Pessoa(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override

    public String toString(){
        return "Nome: " + nome + " Idade: " + idade + " Altura: " + altura;
    }
}
