package br.com.alura.semana_11.Teste;

import br.com.alura.semana_11.Modelo.NumerosRomanos;

public class TestaNumerosRomanos {
    public static void main(String[] args) {
        NumerosRomanos numeros = new NumerosRomanos();

        System.out.println(numeros.buscaChave("II"));
        System.out.println("----------------------------------------");
        
        numeros.mostraChaves();
        System.out.println("----------------------------------------");
    }
}
