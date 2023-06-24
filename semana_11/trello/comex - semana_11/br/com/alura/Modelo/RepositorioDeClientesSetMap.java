package br.com.alura.Modelo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepositorioDeClientesSetMap {
    private Set<Cliente> lista = new HashSet<>();
    private String chave;
    private Map<String, Cliente> cadastroCliente;

    public RepositorioDeClientesSetMap(){
        cadastroCliente = new HashMap<>();
    }

    public void adicionar(Cliente cliente) {
        this.lista.add(cliente);
        this.cadastroCliente.put(cliente.getNome(), cliente);
    }

    public Map buscaTodos() {
        return this.cadastroCliente;
    }

    public boolean buscaPorCliente(Cliente cliente) {
        return this.cadastroCliente.containsValue(cliente);
    }

    public int getQuantidadeDeClientesArmazenados() {
        return this.cadastroCliente.size();
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