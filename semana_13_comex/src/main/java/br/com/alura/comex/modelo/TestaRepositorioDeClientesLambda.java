package br.com.alura.comex.modelo;

import br.com.alura.comex.repositorio.RepositorioDeClientesLambda;

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
//        List<br.com.alura.comex.modelo.Cliente> clientes = repositorio.buscaTodosList();
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
