package br.com.impacta.meuprimeiroprojeto.math;

import java.util.Scanner;

public class MathCalculation {
    public void playMath(String nome, int x, int fatorMultiplicacao){
        x = x * fatorMultiplicacao;
        System.out.println("x is " + x + " to "+ nome +"s calculation!!!");
    }
    public int somar(int y, int z){
        int x = y + z;
        return x;
    }

    public int subtrair(int y, int z){
        int x = y -z;
        return x;
    }

    public int module(int y, int z){
        int x = y % z;
        return x;
    }

    public int multiplicar(int y, int z){
        int x = y * z;
        return x;
    }

    public int dividir(int y, int z){
        int x = y / z;
        return x;
    }
    public int incrementar(int y){
        int x = y++;
        return x;
    }
    public int decrementar(int y){
        int x = y--;
        return x;
    }


    public static void main(String[] args) {
//        Scanner scanner_nome = new Scanner(System.in);
//        System.out.print("Qual o seu nome: ");
//        String nome = scanner_nome.next();
//
//        Scanner scanner_x = new Scanner(System.in);
//        System.out.print("Qual o valor de x: ");
//        int x = Integer.parseInt( scanner_x.next());
//
//        Scanner scanner_fator = new Scanner(System.in);
//        System.out.print("Qual o valor do fator: ");
//        int fator = Integer.parseInt( scanner_fator.next());
//
//        MathCalculation mathCalculation = new MathCalculation();
//        mathCalculation.playMath(nome, x, fator);

        MathCalculation mathCalculation = new MathCalculation();
        int resultadoSoma = mathCalculation.somar(5,2);
        int resultadoSubtracao = mathCalculation.subtrair(5,2);
        int resultadoDivisao = mathCalculation.dividir(5,2);
        int resultadoMultiplicacao = mathCalculation.multiplicar(5,2);
        int resultadoModulo = mathCalculation.module(5,2);
        int incrementar = mathCalculation.incrementar(resultadoSoma);
        int decrementar = mathCalculation.decrementar(resultadoMultiplicacao);

        System.out.println("Resultado Soma " + resultadoSoma);
        System.out.println("Resultado Subtracao " + resultadoSubtracao);
        System.out.println("Resultado Divisao " + resultadoDivisao);
        System.out.println("Resultado Multiplicacao " + resultadoMultiplicacao);
        System.out.println("Resultado Modulo " + resultadoModulo);
        System.out.println("Resultado incrementar " + incrementar);
        System.out.println("Resultado decrementar " + decrementar);
    }
}
