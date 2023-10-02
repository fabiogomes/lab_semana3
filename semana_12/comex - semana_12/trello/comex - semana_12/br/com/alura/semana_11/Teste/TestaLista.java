package br.com.alura.semana_11.Teste;

import java.util.ArrayList;

public class TestaLista {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("Fabio");
        lista.add("Welson");
        lista.add("Amanda");
        lista.add("Fabio");


        System.out.println("Quantidade: " + lista.size());
        System.out.println(lista);
        System.out.println(lista.get(lista.size()-1));

    }
}
