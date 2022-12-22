package br.com.impacta.meuprimeiroprojeto.activities;

import java.util.Scanner;

public class DesafioLogica_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("valor: ");
        int x = scanner.nextInt();

        if(x % 2 == 0){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero Impar");
        }
    }
}
