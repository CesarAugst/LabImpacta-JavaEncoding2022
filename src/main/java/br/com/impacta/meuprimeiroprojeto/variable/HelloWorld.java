package br.com.impacta.meuprimeiroprojeto.variable;

import br.com.impacta.meuprimeiroprojeto.animal.Dog;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World "+args[0]);

        Dog dog = new Dog();
        dog.bark();
    }
}
