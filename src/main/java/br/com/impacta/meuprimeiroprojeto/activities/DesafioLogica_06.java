package br.com.impacta.meuprimeiroprojeto.activities;

import java.util.Scanner;

public class DesafioLogica_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor: ");
        int num = scanner.nextInt();

        System.out.println("Divisivel por 2 " + (num % 2 == 0));
        System.out.println("Divisivel por 4 " + (num % 4 == 0));
        System.out.println("Divisivel por 8 " + (num % 8 == 0));
        System.out.println("Divisivel por 16 "+ (num % 16 == 0));
        System.out.println("Divisivel por 32 "+ (num % 32 == 0));
        System.out.println("Divisivel por 64 " + (num % 64 == 0));
    }
}
