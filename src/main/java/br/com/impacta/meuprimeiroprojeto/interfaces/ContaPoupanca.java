package br.com.impacta.meuprimeiroprojeto.interfaces;

public class ContaPoupanca implements Conta{
    public int numeroConta;
    public double saldo;
    ContaPoupanca(int numeroConta, double saldoInicial){
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    @Override
    public void sacar(double valor) {
        if(valor > this.saldo){
            System.out.println("valor muito alto");
        }else{
            this.saldo -= valor;
            System.out.println("sacando");
            System.out.println("saldo após o saque: " + this.saldo);
        }
    }
    @Override
    public void depositar(double valor) {
        System.out.println("Valor inicial: " + this.saldo);
        this.saldo += valor;
        System.out.println("Valor após depósito: " + this.saldo);
    }
    public void imprimirExtrato() {
        System.out.println("Imprimindo valor atual: " + this.saldo);
    }
    public void calcularJuros() {
        System.out.println(this.saldo*0.05);
    }
    public  void transferir(int numeroContaDestino, double valorTransferido){
        if(valorTransferido < this.saldo){
            System.out.println("Enviando dinheirinho para a conta: " + numeroContaDestino);
            this.saldo -= valorTransferido;
            System.out.println("Novo saldo: " + this.saldo);
        }else{
            System.out.println("Voce não tem cacife, deposite o valor faltante e tente novamente");
        }
    }
}
