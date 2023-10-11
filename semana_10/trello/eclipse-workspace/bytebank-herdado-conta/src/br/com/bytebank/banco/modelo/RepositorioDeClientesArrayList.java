package br.com.bytebank.banco.modelo;

import java.util.ArrayList;

public class RepositorioDeClientesArrayList {
    private ArrayList<Cliente> lista;
    private int posicao;

    public RepositorioDeClientesArrayList() {
        lista = new ArrayList<>();
        posicao = 0;
    }

    public void AddCliente(Cliente cliente){
        this.lista.add(cliente);
        this.posicao++;
    }

    public void ListaClientes(){
        for(int i = 0; i < 10; i++){
            if(this.lista.get(i) != null) {
                String exibe = this.lista.get(i).getNome();
                System.out.println("Cliente Posicao: " + i + ": " + exibe);
            }
        }
    }

    public void BuscaCliente(int posicao){
        System.out.println("Cliente posicao " + posicao + ": " + lista.get(posicao).getNome());
    }

    public void ListaQuantidade(){
        int quantidade = this.lista.size();
        System.out.println("Quantidade de Clientes: " + quantidade);
    }
}
