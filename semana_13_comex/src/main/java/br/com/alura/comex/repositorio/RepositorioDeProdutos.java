package br.com.alura.comex.repositorio;

import br.com.alura.comex.modelo.Produto;

import java.util.*;

public class RepositorioDeProdutos {
    private List<Produto> lista = new ArrayList<>();

    public void adicionar(Produto produto) {
        this.lista.add(produto);
    }

    public List buscaTodosList() {
        return this.lista;
    }

    public List<String> buscaListaNome() {
        List<String> nomes = new ArrayList<>();

        for (Produto produto :lista) {
            nomes.add(produto.getNome());
        }

        return nomes;
    }

    public int getQuantidadeDeClientesArmazenados() {
        return this.lista.size();
    }

    public void mostra() {
        for(int i = 0; i < this.lista.size(); i++) {
            System.out.println("Nome: " + this.lista.get(i).getNome());
        }
    }

    public void mostraComLambda() {
        this.lista.forEach(cliente -> System.out.println("Nome: " + cliente.getNome()));
    }
}
