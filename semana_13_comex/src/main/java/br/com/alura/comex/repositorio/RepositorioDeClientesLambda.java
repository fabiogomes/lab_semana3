package br.com.alura.comex.repositorio;

import br.com.alura.comex.modelo.Cliente;

import java.util.*;

public class RepositorioDeClientesLambda {
    private List<Cliente> lista = new ArrayList<>();
    private String chave;
    private Map<String, Cliente> cadastroCliente;

    public RepositorioDeClientesLambda(){
        cadastroCliente = new HashMap<>();
    }

    public void adicionar(Cliente cliente) {
        this.lista.add(cliente);
        this.cadastroCliente.put(cliente.getNome(), cliente);
    }

    public Map buscaTodosMap() {
        return this.cadastroCliente;
    }
    public List buscaTodosList() {
        return this.lista;
    }

    public boolean buscaPorCliente(Cliente cliente) {
        return this.cadastroCliente.containsValue(cliente);
    }

    public int getQuantidadeDeClientesArmazenados() {
        return this.cadastroCliente.size();
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