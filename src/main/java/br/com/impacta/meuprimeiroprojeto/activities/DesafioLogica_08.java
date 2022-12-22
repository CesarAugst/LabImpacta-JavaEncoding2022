package br.com.impacta.meuprimeiroprojeto.activities;

import java.util.Scanner;

public class DesafioLogica_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Altura do reservatorio: ");
        float height = scanner.nextFloat();

        System.out.print("Largura do reservatorio: ");
        float width = scanner.nextFloat();

        System.out.print("comprimento do reservatorio: ");
        float fill = scanner.nextFloat();

        System.out.print("Consumo médio: ");
        float media = scanner.nextFloat();

        double capacidadeTotal = (height * width * fill) / 1000;

        double autonomia = (capacidadeTotal / media);

        if(autonomia < 3){
            System.out.println("Consumo elevado");
        }else if(autonomia <= 8){
            System.out.println("Consumo moderado");
        }else{
            System.out.println("Consumo reduzido");
        }
        scanner.close();
    }
}
