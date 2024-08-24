package Exercicio_19;

public class Main {
    public static void main(String[] args) {
        Livro_digital livro = new Livro_digital("bla bla", "machado de assis", "180KB");
        livro.abrir();
        livro.fechar();

        System.out.println(livro);
    }
}
