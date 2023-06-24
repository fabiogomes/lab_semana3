package br.com.alura.Teste;

import br.com.alura.Modelo.Cliente;
import br.com.alura.Modelo.RepositorioDeClientesMelhor;

import java.util.List;

public class TestaRepositorioDeClientesMelhor {
    public static void main(String[] args) {
        RepositorioDeClientesMelhor repositorio = new RepositorioDeClientesMelhor();

        Cliente fabio = new Cliente("Fabio");

        Cliente fulano = new Cliente("Fulano");

        Cliente amanda = new Cliente("Amanda");

        repositorio.adicionar(fabio);
        repositorio.adicionar(fulano);
        repositorio.adicionar(amanda);

        System.out.println(">> Mostra com Lambda ===========================================");
        repositorio.mostraComLambda();

        System.out.println(">> Mostra sem Lambda ===========================================");
        repositorio.mostra();

        System.out.println("Quantidade: " + repositorio.getQuantidadeDeClientesArmazenados());

        List<Cliente> clientes = repositorio.buscaTodos();

        for(int i = 0; i < clientes.size(); i++) {
            System.out.println("Nome: " + clientes.get(i).getNome());
        }

        System.out.println("====== Ordenação ========================");

        repositorio.ordenacaoCrescente();

        System.out.println("=========================================");

        repositorio.ordenacaoDecrescente();
    }
}
