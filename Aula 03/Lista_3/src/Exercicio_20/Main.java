package Exercicio_20;

public class Main {
    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta("bla bla", "monarch", 20);

        bike.pedalar();
        bike.frear();

        System.out.println(bike);
    }
}
