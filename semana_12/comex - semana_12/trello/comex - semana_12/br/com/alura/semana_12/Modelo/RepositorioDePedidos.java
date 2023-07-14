package br.com.alura.semana_12.Modelo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepositorioDePedidos {
    private Set<Pedido> pedido = new HashSet<>();

    public void adicionarPedido(Pedido pedido){
        this.pedido.add(pedido);
    }

    public void mostraPedidoMaioresQue10(){
        Stream<Pedido> lista = this.pedido.stream();
        Stream<Pedido> streamPedidos = lista.filter(pedido -> pedido.getQuantidade() > 10);
        streamPedidos.forEach(p -> System.out.println(p));
    }

    public List<Pedido> mostraTotalizacaoDePedidoMaioresQue10(){
        return  pedido.stream()
                .filter(p -> p.getQuantidade() > 100)
                .collect(Collectors.toList());

//        int soma = pedido.stream()
//                .filter(c -> c.getQuantidade() > 10)
//                .mapToInt(Pedido::getQuantidade)
//                .sum();
//        System.out.println(soma);
    }
}
