package br.com.alura.semana_11.Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepositorioDeClientesMelhor {
    private ArrayList<Cliente> lista = new ArrayList<Cliente>();

    public void adicionar(Cliente cliente) {
        this.lista.add(cliente);
    }

    public List<Cliente> buscaTodos() {
        return this.lista;
    }

    public Cliente buscaPorPosicao(int posicao) {
        return this.lista.get(posicao);
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

    public void ordenacaoCrescente() {
        Collections.sort(this.lista);
        this.mostra();
    }

    public void ordenacaoDecrescente() {
        Collections.reverse(this.lista);
        this.mostra();
    }
}