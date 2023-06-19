package br.com.alura.Loja.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;

    private List<Produto> itens;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void AddItens(Produto itens) {
        this.itens.add(itens);
    }
}
