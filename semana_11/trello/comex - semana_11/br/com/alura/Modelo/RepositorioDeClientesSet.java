package br.com.alura.Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class RepositorioDeClientesSet {
    private Set<Cliente> lista = new HashSet<>();

    public void adicionar(Cliente cliente) {

        this.lista.add(cliente);
    }

    public Set<Cliente> buscaTodos() {

        return this.lista;
    }

    public boolean buscaPorCliente(String cliente) {

        return this.lista.contains(cliente);
    }

    public int getQuantidadeDeClientesArmazenados() {

        return this.lista.size();
    }

    public void mostra() {
        for(Cliente cliente : lista){
            System.out.println("Nome: " + cliente.getNome());
        }
    }

    public void mostraComLambda() {
        this.lista.forEach(cliente -> System.out.println("Nome: " + cliente.getNome()));
    }



//    public void ordenacaoCrescente() {
//        Collections.sort(this.lista);
//        this.mostra();
//    }
//
//    public void ordenacaoDecrescente() {
//        Collections.reverse(this.lista);
//        this.mostra();
//    }
}