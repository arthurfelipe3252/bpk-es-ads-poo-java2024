public class Entregador {
    private String nome;
    private int idade;
    private String cpf;

    public Entregador(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    @Override

    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf;
    }
}
