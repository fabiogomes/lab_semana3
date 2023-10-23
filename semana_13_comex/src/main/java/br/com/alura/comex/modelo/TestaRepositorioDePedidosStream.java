package br.com.alura.comex.modelo;

import br.com.alura.comex.repositorio.RepositorioDePedidos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TestaRepositorioDePedidosStream {
    public static void main(String[] args) {
        RepositorioDePedidos repositorio = new RepositorioDePedidos();

        System.out.println("------------------------------------------------------------");
        Cliente fulano = new Cliente("Fulano");
        fulano.setDataNascimentoCliente(LocalDate.of(1992, 02, 06));
        Pedido pedidoFulano = new Pedido();
        pedidoFulano.setCliente(fulano);
        pedidoFulano.setQuantidade(15);
        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println("Data de cadastro do cliente: " + fulano.getDataCadastroCliente());
        System.out.println("Data de cadastro do pedido: " + pedidoFulano.getDataCadastroPedido());
        //System.out.println(fulano.getDataCadastroClienteFormatada());
        System.out.println();

        System.out.println("------------------------------------------------------------");
        Cliente beltrano = new Cliente("Beltrano");
        beltrano.setDataNascimentoCliente(LocalDate.of(1990, 01, 01));
        Pedido pedidoBeltrano = new Pedido();
        pedidoBeltrano.setCliente(beltrano);
        pedidoBeltrano.setQuantidade(5);
        System.out.println("Data de cadastro do cliente: " + beltrano.getDataCadastroCliente());
        System.out.println("Data de cadastro do pedido: " + pedidoBeltrano.getDataCadastroPedido());
        //System.out.println(beltrano.getDataCadastroClienteFormatada());
        System.out.println();

        System.out.println("------------------------------------------------------------");
        Cliente sicrano= new Cliente("Sicrano");
        sicrano.setDataNascimentoCliente(LocalDate.of(1980, 02, 02));
        Pedido pedidoSicrano = new Pedido();
        pedidoSicrano.setCliente(sicrano);
        pedidoSicrano.setQuantidade(75);
        System.out.println("Data de cadastro do cliente: " + sicrano.getDataCadastroCliente());
        System.out.println("Data de cadastro do pedido: " + pedidoSicrano.getDataCadastroPedido());
        //System.out.println(sicrano.getDataCadastroClienteFormatada());
        System.out.println();

        System.out.println("------------------------------------------------------------");
        repositorio.adicionarPedido(pedidoFulano);
        repositorio.adicionarPedido(pedidoBeltrano);
        repositorio.adicionarPedido(pedidoSicrano);

        repositorio.mostraPedidoMaioresQue10();
        System.out.println();

        System.out.println("------------------------------------------------------------");
        List<Pedido> pedidos = repositorio.mostraTotalizacaoDePedidoMaioresQue10();
        System.out.println(pedidos);
        System.out.println();

// Resultado => br.com.alura.comex.modelo.Pedido{cliente=br.com.alura.comex.modelo.Cliente{nome='Fulano'}, quantidade=15}
    }
}
