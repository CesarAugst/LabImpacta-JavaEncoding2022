package br.com.impacta.meuprimeiroprojeto.classes;

public class ClasseDoBanco {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setNumero(555);
        conta1.setTitular("Luan");
        conta1.setSaldo(1000000.0);


        Conta conta2 = new Conta(123, "Roan");
        Conta conta3 = new Conta(658, "Erika", 200000000.0);

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        System.out.println(conta3.toString());
    }


}
