package Exercicio_8;

public class Professor {
    private String nome;
    private String disciplina;
    private float salario;

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

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina != null) {
            this.disciplina = disciplina;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario < 0) {
            this.salario = salario;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

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
