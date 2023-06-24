package br.com.alura.Teste;

import br.com.alura.Modelo.NumerosRomanos;
import br.com.alura.Teste.TestaNumerosRomanos;

public class TestaNumerosRomanos {
    public static void main(String[] args) {
        NumerosRomanos numeros = new NumerosRomanos();

        System.out.println(numeros.buscaChave("II"));
        System.out.println("----------------------------------------");
        
        numeros.mostraChaves();
        System.out.println("----------------------------------------");
    }
}
