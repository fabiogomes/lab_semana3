package br.com.alura.Teste;

import br.com.alura.Modelo.Cliente;
import br.com.alura.Modelo.RepositorioDeClientes;

public class TestaRegistroDeClientes {
    public static void main(String[] args) {
        RepositorioDeClientes repositorio = new RepositorioDeClientes();

        Cliente david = new Cliente("David");

        System.out.println("Quantidade de clientes registrados: " + repositorio.getQuantidadeDeClientesArmazenados());

        repositorio.adicionar(david);

        System.out.println("Quantidade de clientes registrados: " + repositorio.getQuantidadeDeClientesArmazenados());

        Cliente[] clientes = repositorio.buscaTodos();

        for(int i = 0; i < clientes.length; i++) {
            if(clientes[i] != null)
                System.out.println(clientes[i].getNome());
        }

        Cliente clienteDavid = repositorio.buscaPorPosicao(0);
        System.out.println("Nome do cliente na posição 0: " + clienteDavid.getNome());

        Cliente juliano = new Cliente("Juliano");

        repositorio.adicionar(juliano);

        System.out.println("Quantidade de clientes registrados: " + repositorio.getQuantidadeDeClientesArmazenados());

        repositorio.mostra();
    }


}
