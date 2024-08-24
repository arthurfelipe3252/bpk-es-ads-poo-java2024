package Exercicio_12;

public class Filme {
    private String titulo;
    private String diretor;
    private String duracao;

    public Filme(String titulo, String diretor, String duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciar(){
        System.out.println("Iniciando Filme");
    }

    public void parar(){
        System.out.println("Parando Filme");
    }

    @Override

    public String toString() {
        return titulo + " - " + diretor + " - " + duracao;
    }
}

