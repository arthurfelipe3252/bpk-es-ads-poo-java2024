import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Exercicios {

    public static void exercicio1(){
        System.out.println("Hello world!!!");
        return;
    }

    public static void exercicio2(){
        int variavel_int = 10;
        double variavel_double = 5.99;
        boolean variavel_boolean = true;
        String variavel_char = "ARTHUR";

        System.out.println("Variavel Int: " + variavel_int);
        System.out.println("Variavel Double: " + variavel_double);
        System.out.println("Variavel Boolean: " + variavel_boolean);
        System.out.println("Variavel Char: " + variavel_char);

        return;
    }

    public static void exercicio3(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero1 = scanner.nextInt();


        System.out.println("Informe outro número: ");
        int numero2 = scanner.nextInt();

        int multiplicacaio = numero1 * numero2;
        float divisao = numero1 / numero2;
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacaio);
        System.out.println("Divisao: " + divisao);

        return;
    }

    public static void exercicio4(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é par.");
        } else  {
            System.out.println("O número é impar.");
        }

        return;
    }

    public static void exercicio5(){

        for (int i = 1; i <= 10; i++) {

            System.out.println(" " + i);
        }

        return;
    }

    public static void exercicio6(){

        int vetor[] = {20 , 30 , 40 , 50 ,10};

        for (int i = 0; i < 5; i++) {

            System.out.println(vetor[i]);
        }

        return;
    }

    public static void exercicio7(){

        MetodoEx7 met = new MetodoEx7();

        int valor = met.somar();

        System.out.println(valor);

        return;
    }

    public static void exercicio8(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Informe o seu idade: ");
        int idade = scan.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        return;
    }

    public static void exercicio9(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a operação (+) (-) (/) (*): ");
        String operacao = scan.nextLine();

        System.out.println("Informe o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Informe o primeiro número: ");
        int num2 = scan.nextInt();

        switch (operacao){

            case "+":
                System.out.println(num1 + num2);
                break;

            case "-":
                System.out.println(num1 - num2);
                break;

            case "/":
                System.out.println(num1 / num2);
                break;

            case "*":
                System.out.println(num1 * num2);
                break;
        }

        return;
    }

    public static void exercicio10(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scan.nextInt();

        if (numero == 1) {
            System.out.println("O número é primo.");
            return;
        }

        for (int i = 2; i < numero/2; i++) {

            if (numero % i == 0) {
                System.out.println("Não é primo.");
                return;
            }
        }

        System.out.println("O número é primo.");
        return;
    }

    public static void exercicio11(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a palavra: ");
        String palavra = scan.nextLine();

        int tamanho = palavra.length();

        for (int i = 0; i < palavra.length(); i++) {

            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)){
                System.out.println("Não é palindromo.");
                return;
            }
        }

        System.out.println("É palindromo.");
        return;
    }

    public static void exercicio12(){
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um numero: ");
            numeros[i] = scan.nextInt();
        }

        Arrays.sort(numeros);

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        return;
    }

    public static void exercicio13(){
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int numero_aleatorio = random.nextInt(100) + 1;

        int numero_digitado = 0;

        boolean sent = true;
        while (sent == true) {

            System.out.println("Digite um numero: ");
            numero_digitado = scan.nextInt();

            if (numero_digitado == numero_aleatorio) {
                System.out.println("Você acertou.");
                sent = false;
            } else if (numero_digitado > numero_aleatorio) {
                System.out.println("O numero é menor");
            } else if (numero_digitado < numero_aleatorio) {
                System.out.println("O numero é maior");
            }
        }

        return;
    }

    public static void exercicio14(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma palavra: ");
        String palavra = scan.nextLine();

        int  quantidade_vogal = 0;

        palavra = palavra.toUpperCase();

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            if (letra == 'A' || letra == 'E' || letra == 'I'  ||  letra == 'O'  ||  letra == 'U') {
                quantidade_vogal++;
            }
        }

        System.out.println("A palavra possui " + quantidade_vogal + " vogais.");

        return;
    }

    public static void exercicio15(){
        Scanner scan = new Scanner(System.in);
        FunçãoRecursivaFAT func = new FunçãoRecursivaFAT();

        System.out.println("Informe um número: ");
        int numero = scan.nextInt();

        int fatorial = func.fatorial(numero);

        System.out.println("Fatorial recursiva: " + fatorial );

        fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }


        System.out.println("Fatorial: " + fatorial );
        return;

    }

    public static void exercicio16(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a conversão:   (1)Fahrenheit para Celsius    (2) Celsius para Fahrenheit");
        int resp = scan.nextInt();
        
        if (resp == 2) {

        System.out.println("Informe uma temperatura em graus Celsius: ");
        double tempC = scan.nextDouble();

        tempC = tempC * 1.8 + 32;

        System.out.println("Temperatura em graus em Fahrenheit: " + tempC);
        return;

        } else if (resp == 1) {

            System.out.println("Informe uma temperatura em graus Fahrenheit: ");
            double tempF = scan.nextDouble();

            tempF = (tempF - 32) * 1.8;

            System.out.println("Temperatura em graus em Celsius: " + tempF);
            return;

        } else {
            System.out.println("Codigo inválido.");
            return;

        }

    }
}