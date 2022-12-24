package br.com.impacta.meuprimeiroprojeto.interfaces;

public interface Conta {
    void sacar(double valor);
    void depositar(double valor);
    void imprimirExtrato();
    void calcularJuros();
    void transferir(int numeroContaDestino, double valorTransferido);
}
