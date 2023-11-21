package com.srmasset.comex.springboot.api.core.service;

import com.srmasset.comex.springboot.api.core.orm.Cliente;
import com.srmasset.comex.springboot.api.core.orm.ItemDePedido;
import com.srmasset.comex.springboot.api.core.orm.Pedido;
import com.srmasset.comex.springboot.api.core.orm.Produto;
import com.srmasset.comex.springboot.api.core.repository.ClienteRepository;
import com.srmasset.comex.springboot.api.core.repository.PedidoRepository;
import com.srmasset.comex.springboot.api.core.repository.ProdutoRepository;
import com.srmasset.comex.springboot.api.core.vo.*;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class CrudPedidoService {
    private ClienteRepository clienteRepository;
    private ProdutoRepository produtoRepository;
    private PedidoRepository pedidoRepository;
    public CrudPedidoService(ClienteRepository clienteRepository, ProdutoRepository produtoRepository, PedidoRepository pedidoRepository) {
        this.clienteRepository = clienteRepository;
        this.produtoRepository = produtoRepository;
        this.pedidoRepository = pedidoRepository;
    }


    public void criaPedido(DadosPedido dadosPedido) {
        if(clienteRepository.existsById(String.valueOf(dadosPedido.clienteId()))){
            List<ListaDeProdutosDoPedido> lista = dadosPedido.produtos();
            lista.forEach(pP -> {
                if(!produtoRepository.existsById(pP.id())){
                    throw new RuntimeException("id de produto invalida");
                }
                Optional<Produto> produtoBanco = produtoRepository.findById(pP.id());
                if(produtoBanco.get().getQuantidadeEstoque() < pP.quantidade()){
                    throw new RuntimeException("quantidade em estoque insuficiente");
                }
            });
        }else {
            throw new RuntimeException("id de cliente invalida");
        }
        Cliente cliente = clienteRepository.findById(String.valueOf(dadosPedido.clienteId())).get();
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);

        RelatorioQuantidadeComprasPorCliente relatorioQuantidadeComprasPorCliente = clienteRepository.relatorioQuantidadeComprasPorCliente(dadosPedido.clienteId());
        if(relatorioQuantidadeComprasPorCliente.getQuantidade() > 5){
            pedido.aplicaDescontoFidelidade();
        }

        List<ListaDeProdutosDoPedido> lista = dadosPedido.produtos();
        lista.forEach(pP -> {
            Optional<Produto> produto = produtoRepository.findById(pP.id());
            pedido.adicionarItem(new ItemDePedido(pP.quantidade(), produto.get(), pedido ));
        });

        pedidoRepository.save(pedido);
    }

    public DetalhesPedido detalhaPedido(Long id){
        List<ItensPedido> itensPedido = pedidoRepository.DetalhaItensPedido(id);
        DetalhesPedido detalhesPedido = pedidoRepository.DetalhaPedido(id);
        detalhesPedido.setItensPedido(itensPedido);
        return detalhesPedido;
    }
}

