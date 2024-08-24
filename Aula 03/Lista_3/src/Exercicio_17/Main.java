package Exercicio_17;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("rex", 10 , "18 Kg");

        animal.alimentar();
        animal.dormir();

        System.out.println(animal);
    }
}
