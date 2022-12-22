package br.com.impacta.meuprimeiroprojeto.activities;

import java.util.Scanner;

public class DesafioLogica_01 {

    public String areMoreLessOrEqualNumbers(int x, int y){
        if (x != y) {
            int more = (x > y ? x : y);
            int less = (x < y ? x : y);

            return ("O número maior é: " + more + " e o numero menor é: " + less);
        }else{
            return "Os números são iguais";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        int x = scanner.nextInt();

        System.out.print("Segundo valor: ");
        int y = scanner.nextInt();

        DesafioLogica_01 desafioLogica_01 = new DesafioLogica_01();
        System.out.println(desafioLogica_01.areMoreLessOrEqualNumbers(x, y));

    }
}
