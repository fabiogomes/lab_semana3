package br.com.alura.Teste;

import br.com.alura.Modelo.Cliente;
import br.com.alura.Modelo.RepositorioDeClientesSetMap;

public class TestaRegistroDeClientesSetMap {
    public static void main(String[] args) {
        RepositorioDeClientesSetMap repositorio = new RepositorioDeClientesSetMap();

        Cliente david = new Cliente("David");

        System.out.println("Quantidade de clientes registrados: " + repositorio.getQuantidadeDeClientesArmazenados());
        System.out.println("------------------------------------------------------------------------------");

        repositorio.adicionar(david);

        System.out.println("Quantidade de clientes registrados: " + repositorio.getQuantidadeDeClientesArmazenados());
        System.out.println("------------------------------------------------------------------------------");

        boolean clienteDavid = repositorio.buscaPorCliente(david);
        System.out.println("Nome de cliente david existe: " + clienteDavid);
        System.out.println("------------------------------------------------------------------------------");

        Cliente juliano = new Cliente("Juliano");
        System.out.println("------------------------------------------------------------------------------");

        repositorio.adicionar(juliano);

        System.out.println("Quantidade de clientes registrados: " + repositorio.getQuantidadeDeClientesArmazenados());
        System.out.println("------------------------------------------------------------------------------");

        System.out.println(repositorio.buscaTodos());
        System.out.println("------------------------------------------------------------------------------");

        repositorio.mostraComLambda();
        System.out.println("------------------------------------------------------------------------------");
    }
}
