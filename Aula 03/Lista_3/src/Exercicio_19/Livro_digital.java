package Exercicio_19;

public class Livro_digital {
    private String titulo;
    private String autor;
    private String tamanho_arquivo;

    public Livro_digital(String titulo, String autor, String tamanho_arquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanho_arquivo = tamanho_arquivo;
    }

    public void abrir(){
        System.out.println("Abrindo livro.....");
    }

    public void fechar(){
        System.out.println("Fechando livro.....");
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " - " + tamanho_arquivo;
    }
}
