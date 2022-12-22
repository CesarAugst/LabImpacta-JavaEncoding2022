package br.com.impacta.meuprimeiroprojeto.variable;
import java.util.Scanner;

public class NameRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o seu nome: ");
        String nome = scanner.next();
        if("cesar".equals(nome)){
            System.out.print("Somo charás!!");
        }else{
            System.out.print("Prazer em conhecê-lo " + nome + ". Meu nome é Cesar");
        }
    }
}
