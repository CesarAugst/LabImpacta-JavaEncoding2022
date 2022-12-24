package br.com.impacta.meuprimeiroprojeto.Exercicios;

public class TryCatch {
    public static void main(String[] args) {
        int number[] = {4,8,16,32,64,128};
        int denom[] = {4,8,16,32,64,128};

        for(int i=0; i<number.length; i++){
            try{
                System.out.println(number[i] + " / " + denom[i]);
            }
        }
    }
}
