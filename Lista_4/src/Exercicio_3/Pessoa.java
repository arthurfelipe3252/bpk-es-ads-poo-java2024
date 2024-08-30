package Exercicio_3;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura < 0) {
            this.altura = altura;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    @Override

    public String toString(){
        return "Nome: " + nome + " Idade: " + idade + " Altura: " + altura;
    }
}
