package br.com.impacta.meuprimeiroprojeto.activities;

import java.util.Scanner;

public class DesafioLogica_03 {
    public String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o seu nome: ");
        String nome = scanner.next();

        return nome;
    }
    public int getAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a sua idade: ");
        String idade = scanner.next();

        return Integer.parseInt(idade);
    }

    public String getSituation(int age){
        if(age >=45 || age <= 15){
            return "Astrazeneca";
        }else{
            return "Pfizer ou Moderna";
        }
    }

    public static void main(String[] args) {
        DesafioLogica_03 desafioLogica_03 = new DesafioLogica_03();

        String name = desafioLogica_03.getName();
        int age = desafioLogica_03.getAge();
        String situation = desafioLogica_03.getSituation(age);
        System.out.println("A pessoa: " + name + " de " + age + " anos deve tomar " + situation);
    }
}
