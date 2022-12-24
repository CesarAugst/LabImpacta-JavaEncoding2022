package br.com.impacta.meuprimeiroprojeto.animal;

public interface Animal {
    default void comer(){
        System.out.println("comendo");
    }

    void locomover();
}
