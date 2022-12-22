package br.com.impacta.meuprimeiroprojeto.activities;

import java.util.Scanner;

public class DesafioLogica_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gols do time A: ");
        int team_a = scanner.nextInt();

        System.out.print("Gols do time B: ");
        int team_b = scanner.nextInt();

        if(team_a == team_b){
            System.out.println("Empate");
        } else if (team_a > team_b) {
            System.out.println("Vitória do time A");
        }else{
            System.out.println("Vitória do time B");
        }
    }
}
