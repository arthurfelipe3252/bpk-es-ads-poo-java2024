package Exercicio_1;

import java.util.Scanner;

public class Livro {
    public String titulo;
    public String autor;
    public int paginas;

    void abrir_livro(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual pág abrir?");
        int pag  = leitor.nextInt();

        if(pag <= paginas && pag >= 0){
        System.out.println("\nExercicio_1.Livro foi aberto na página " + pag);
        } else {
            System.out.println("Pág inválida");
        }

    }

    void ler(){
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
