package br.com.impacta.meuprimeiroprojeto.activities;

import java.util.Scanner;

public class DesafioLogica_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto recebeu: ");
        float recebido = scanner.nextFloat();

        System.out.print("Quanto foi gasto: ");
        float gasto = scanner.nextFloat();

        if(recebido >= gasto ){
            System.out.println("Gasto dentro do orçamento");
        }else{
            System.out.println("Orçamento estourado");
        }
    }
}
