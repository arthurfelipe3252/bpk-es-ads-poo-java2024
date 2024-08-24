package Exercicio_4;

public class Conta_bancaria {
public int numero_conta;
public double saldo;

public Conta_bancaria(int numero_conta, float saldo){
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

public String toString(){
    return "Numero da conta: " + numero_conta + " saldo: " + saldo;
}
}