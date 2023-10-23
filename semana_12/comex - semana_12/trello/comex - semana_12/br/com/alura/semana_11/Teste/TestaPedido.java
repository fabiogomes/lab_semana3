package br.com.alura.semana_11.Teste;

import br.com.alura.semana_11.Modelo.Cliente;
import br.com.alura.semana_11.Modelo.Pedido;

public class TestaPedido {
    public static void main(String[] args) {
        Integer i = null; //Integer.valueOf(10);
        Cliente fabio = new Cliente("Fabio");

        Pedido pedidoFabio = new Pedido();
        pedidoFabio.setCliente(fabio);
        pedidoFabio.setQuantidade(i);

        System.out.println("Quantidade: " + pedidoFabio.getQuantidade().longValue());
    }
}
