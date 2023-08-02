package br.com.alura.semana_12.Teste;

import br.com.alura.semana_12.Modelo.Cliente;
import br.com.alura.semana_12.Modelo.RepositorioDeClientesLambda;

public class TestaRepositorioDeClientesLambda {
    public static void main(String[] args) {
        RepositorioDeClientesLambda repositorio = new RepositorioDeClientesLambda();

        Cliente fabio = new Cliente("Fabio");

        Cliente fulano = new Cliente("Fulano");

        Cliente amanda = new Cliente("Amanda");

        repositorio.adicionar(fabio);
        repositorio.adicionar(fulano);
        repositorio.adicionar(amanda);

        System.out.println(">> Mostra com Lambda ===========================================");
        repositorio.mostraComLambda();
        System.out.println("");

        System.out.println(">> Mostra for comum  ===========================================");
        repositorio.mostra();
        System.out.println("");

        System.out.println(">> Mostra quantidade ===========================================");
        System.out.println("Quantidade: " + repositorio.getQuantidadeDeClientesArmazenados());
        System.out.println("");

//        System.out.println(">> Mostra ===========================================");
//        List<Cliente> clientes = repositorio.buscaTodosList();
//        for(int i = 0; i < clientes.size(); i++) {
//            System.out.println("Nome: " + clientes.get(i).getNome());
//        }

        System.out.println("Ordenação crescente ================================");
        repositorio.ordenacaoCrescente();
        System.out.println("");

        System.out.println("Ordenação decrescente ==============================");
        repositorio.ordenacaoDecrescente();
        System.out.println("");
    }
}
