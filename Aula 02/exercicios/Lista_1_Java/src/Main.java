import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o exercicio?");
        String exercicio = scanner.nextLine();

        Exercicios arquivo_exercicio = new Exercicios();

        switch (exercicio) {
            case "1":
                arquivo_exercicio.exercicio1();
                break;

            case "2":
                arquivo_exercicio.exercicio2();
                break;

            case "3":
                arquivo_exercicio.exercicio3();
                break;

            case "4":
                arquivo_exercicio.exercicio4();
                break;

            case "5":
                arquivo_exercicio.exercicio5();
                break;

                case "6":
                arquivo_exercicio.exercicio6();
                break;

                case "7":
                arquivo_exercicio.exercicio7();
                break;

            case "8":
                arquivo_exercicio.exercicio8();
                break;

            case "9":
                arquivo_exercicio.exercicio9();
                break;

            case "10":
                arquivo_exercicio.exercicio10();
                break;

            case "11":
                arquivo_exercicio.exercicio11();
                break;

            case "12":
                arquivo_exercicio.exercicio12();
                break;

            case "13":
                arquivo_exercicio.exercicio13();
                break;

            case "14":
                arquivo_exercicio.exercicio14();
                break;

            case "15":
                arquivo_exercicio.exercicio15();
                break;

            case "16":
                arquivo_exercicio.exercicio16();
                break;

        }
    }
}