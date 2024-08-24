package Exercicio_4;

public class Main {
    public static void main(String[] args) {
        Conta_bancaria conta = new Conta_bancaria(001, 600);

        conta.depositar(400);
        System.out.println(conta.saldo);
        conta.sacar(500);
        System.out.println(conta.saldo);
        System.out.println(conta);

    }
}
