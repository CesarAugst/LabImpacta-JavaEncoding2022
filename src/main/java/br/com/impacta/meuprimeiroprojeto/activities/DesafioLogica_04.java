package br.com.impacta.meuprimeiroprojeto.activities;

import java.util.Calendar;
import java.util.Scanner;

public class DesafioLogica_04 {

    public boolean validDay(int day){
        if(day < 31 && day > 1){
            return true;
        }else{
            return false;
        }
    }

    public boolean validMonth(int month){
        if(month < 12 && month > 1){
            return true;
        }else{
            return false;
        }
    }

    public boolean validYear(int year){
        Calendar cal = Calendar.getInstance();
        int actual_year = cal.get(Calendar.YEAR);
        if(year > 0 && year < actual_year+1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dia: ");
        int day = scanner.nextInt();

        System.out.print("Mês: ");
        int month = scanner.nextInt();

        System.out.print("Ano: ");
        int year = scanner.nextInt();

        DesafioLogica_04 desafioLogica_04 = new DesafioLogica_04();
        if(desafioLogica_04.validYear(year) && desafioLogica_04.validMonth(month) && desafioLogica_04.validDay(day)){
            System.out.println("data valida");
        }else{
            System.out.println("data invalida");
        }

    }
}
