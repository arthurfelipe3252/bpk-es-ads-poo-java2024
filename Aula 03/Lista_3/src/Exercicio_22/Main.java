package Exercicio_22;

public class Main {
    public static void main(String[] args) {
        Empresa emp = new Empresa("bla bla", "1681618186168", 20);

        emp.contratar();
        emp.demitir();

        System.out.println(emp);
    }
}
