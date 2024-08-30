package Exercicio_4;

public class Conta_bancaria {
    private int numero_conta;
    private double saldo;

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        if (numero_conta < 0) {
            this.numero_conta = numero_conta;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Erro ao setar variavel");
        }
    }

    public Conta_bancaria(int numero_conta, float saldo) {
        this.numero_conta = numero_conta;
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Valor depositado com sucesso!");
    }

    public void sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }


    @Override

    public String toString() {
        return "Numero da conta: " + numero_conta + " saldo: " + saldo;
    }
}