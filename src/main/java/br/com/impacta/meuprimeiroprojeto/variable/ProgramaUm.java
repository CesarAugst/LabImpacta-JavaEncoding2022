package br.com.impacta.meuprimeiroprojeto.variable;

public class ProgramaUm {
    public static void main(String[] args) {//declara numero
        int numero1= 2000;
        System.out.println("Meu numero " + numero1);
        String nome = "Cesar";
        System.out.println("Meu nome " + nome);

        System.out.format("My favorite number is %.3f.\n", 3.141592654);

        //part of a times table:
        System.out.format("%2d %2d %2d\n", 4, 6, 8);
        System.out.format("%2d %2d %2d\n", 8, 12, 16);
    }
}
