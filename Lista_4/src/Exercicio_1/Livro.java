package Exercicio_1;

import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    void abrir_livro() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual pág abrir?");
        int pag = leitor.nextInt();

        if (pag <= paginas && pag >= 0) {
            System.out.println("\nExercicio_1.Livro foi aberto na página " + pag);
        } else {
            System.out.println("Pág inválida");
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setTitulo(String titulo) {

        if (titulo != null) {
            this.titulo = titulo;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public void setAutor(String autor) {
        if (autor != null) {
            this.autor = autor;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public void setPaginas(int paginas) {
        if (paginas < 0) {
            this.paginas = paginas;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    void ler() {
        System.out.println("Lendo a página");
    }

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " - " + paginas;
    }
}
