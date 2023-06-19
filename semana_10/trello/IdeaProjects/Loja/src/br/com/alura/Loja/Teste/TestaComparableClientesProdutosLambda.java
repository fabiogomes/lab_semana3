package br.com.alura.Loja.Teste;

import br.com.alura.Loja.Modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaComparableClientesProdutosLambda {
    public static void main(String[] args) {
        Cliente paula = new Cliente("paula", "111111111-1");
        paula.setProfissao("Bancaria");
        paula.setTelefone("11 1111-1111");

        Cliente sara = new Cliente("sara", "222222222-2","paula@gmail.com");
        paula.setProfissao("Quimica");
        paula.setTelefone("22 2222-2222");

        Cliente xavier = new Cliente("xavier", "333333333-3","xavier@gmail.com");
        paula.setProfissao("Preofessor");
        paula.setTelefone("33 3333-3333");

        List<Cliente> lista = new ArrayList<>();

        lista.add(paula);
        lista.add(xavier);
        lista.add(sara);

        for(Cliente cliente : lista) {
            System.out.println(cliente.getNome());
        }
        System.out.println("________________________");

        Comparator<Cliente> compNome = (Cliente c1, Cliente c2) -> {
            String nomeC1 = c1.getNome();
            String nomeC2 = c2.getNome();
            return nomeC1.compareTo(nomeC2);
        };

        lista.sort(compNome);

        for(Cliente cliente : lista) {
            System.out.println(cliente.getNome());
        }
        System.out.println("________________________");
    }
}

