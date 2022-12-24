package br.com.impacta.meuprimeiroprojeto.interfaces;

public class SandBox {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(123, 1000);
        System.out.println("--sacar");
        contaPoupanca.sacar(200);
        contaPoupanca.sacar(2000);
        System.out.println("--depositar");
        contaPoupanca.depositar(2000);
        System.out.println("--imprimirExtrato");
        contaPoupanca.imprimirExtrato();
        System.out.println("--calcularJuros");
        contaPoupanca.calcularJuros();
        System.out.println("--transferir");
        contaPoupanca.transferir(123, 5000);
        contaPoupanca.transferir(123, 500);
    }
}
