package br.com.testejar;

import br.com.alura.comex.modelo.ExceptionFalhaMotor;

public class Main {
    public static void main(String[] args){

        System.out.println("Hello world!");
        throw new ExceptionFalhaMotor("Falha personalizada lançada do JAR");
    }
}