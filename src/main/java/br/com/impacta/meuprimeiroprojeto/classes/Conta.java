package br.com.impacta.meuprimeiroprojeto.classes;

public class Conta {
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private int numero;
    private String titular;
    private double saldo;

    public Conta(){}

    public Conta(int numero, String titular, double saldo){
        super();
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(int numero, String titular){
        super();
        this.numero = numero;
        this.titular = titular;
    }

    public String toString(){
        return "O dono dessa conta se chama "+ titular +" com o numero de conta "+numero+" Com saldo "+saldo;
    }

}
