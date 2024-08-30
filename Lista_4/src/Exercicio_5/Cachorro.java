package Exercicio_5;

public class Cachorro {
    private   String nome;
    private  int idade;
    private  String raca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            this.idade = idade;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca != null) {
            this.raca = raca;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

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
