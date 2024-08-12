import java.util.Scanner;

public class MetodoEx7 {

    public static int somar(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        System.out.println("Informe outro valor: ");
        int valor2 = sc.nextInt();

        return valor + valor2;
    }
}
