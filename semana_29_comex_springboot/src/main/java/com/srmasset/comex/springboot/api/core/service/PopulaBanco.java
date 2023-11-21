package com.srmasset.comex.springboot.api.core.service;

import com.srmasset.comex.springboot.api.core.orm.*;
import com.srmasset.comex.springboot.api.core.repository.CategoriaRepository;
import com.srmasset.comex.springboot.api.core.repository.ClienteRepository;
import com.srmasset.comex.springboot.api.core.repository.PedidoRepository;
import com.srmasset.comex.springboot.api.core.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PopulaBanco {
    private final ClienteRepository clienteRepository;
    private final CategoriaRepository categoriaRepository;
    private final ProdutoRepository produtoRepository;
    private final PedidoRepository pedidoRepository;

    public PopulaBanco(ClienteRepository clienteRepository,
                       CategoriaRepository categoriaRepository,
                       ProdutoRepository produtoRepository,
                       PedidoRepository pedidoRepository){
        this.clienteRepository = clienteRepository;
        this.categoriaRepository = categoriaRepository;
        this.produtoRepository =produtoRepository;
        this.pedidoRepository = pedidoRepository;
    }

    public void popular(){
        Endereco endereco = new Endereco("RUA", "11", "BAIRRO", "CIDADE", "SP");
        Endereco endereco2 = new Endereco("RUA2", "112", "BAIRRO2", "CIDADE2", "MG");
        Endereco endereco3 = new Endereco("RUA3", "221", "BAIRRO3", "CIDADE3", "PR");
        Endereco endereco4 = new Endereco("RUA4", "332", "BAIRRO4", "CIDADE4", "GO");
        Cliente cliente = new Cliente("1111111111111", "David", "111112222", endereco);
        Cliente cliente2 = new Cliente("2222222222222", "Fabio", "222223333", endereco2);
        Cliente cliente3 = new Cliente("3333333333333", "Leonardo", "444445555", endereco3);
        Cliente cliente4 = new Cliente("4444444444444", "SRM", "555554444", endereco4);
        clienteRepository.save(cliente);
        clienteRepository.save(cliente2);
        clienteRepository.save(cliente3);
        clienteRepository.save(cliente4);

        Categoria informatica = new Categoria("Informatica");
        Categoria livros = new Categoria("Livros");
        Categoria linhaBranca = new Categoria("Linha Branca");
        categoriaRepository.save(informatica);
        categoriaRepository.save(livros);
        categoriaRepository.save(linhaBranca);

        Produto livro = new Produto("Battle", new BigDecimal(500), "Batalhas Historicas", 15, livros);
        Produto pcbasico = new Produto("Escritorio", new BigDecimal(2000), "Desktop", 60, informatica);
        Produto geladeira = new Produto("Geladeira", new BigDecimal(5000), "Consul Frost Free", 25, linhaBranca);
        Produto lavadora = new Produto("Lavadora", new BigDecimal(3000), "Brastemp 15Kg", 7, linhaBranca);
        produtoRepository.save(livro);
        produtoRepository.save(pcbasico);
        produtoRepository.save(geladeira);
        produtoRepository.save(lavadora);

        Pedido pedidoDavid = new Pedido(cliente);
        pedidoDavid.adicionarItem(new ItemDePedido(1, geladeira, pedidoDavid));
        pedidoDavid.adicionarItem(new ItemDePedido(1, lavadora, pedidoDavid));
        Pedido pedidoDavid2 = new Pedido(cliente);
        pedidoDavid2.adicionarItem(new ItemDePedido(1, pcbasico, pedidoDavid2));

        Pedido pedidoLeonardo = new Pedido(cliente3);
        pedidoLeonardo.adicionarItem(new ItemDePedido(2, livro, pedidoLeonardo));
        pedidoLeonardo.adicionarItem(new ItemDePedido(1, pcbasico, pedidoLeonardo ));

        Pedido pedidoFabio = new Pedido(cliente2);
        pedidoFabio.adicionarItem(new ItemDePedido(1, pcbasico, pedidoFabio));
        pedidoFabio.adicionarItem(new ItemDePedido(1, livro, pedidoFabio));
        pedidoFabio.adicionarItem(new ItemDePedido(1, geladeira, pedidoFabio));

        Pedido srm = new Pedido(cliente4);
        srm.adicionarItem(new ItemDePedido(5, geladeira, srm));
        srm.adicionarItem(new ItemDePedido(2, pcbasico, srm));

        pedidoRepository.save(pedidoDavid);
        pedidoRepository.save(pedidoDavid2);
        pedidoRepository.save(pedidoLeonardo);
        pedidoRepository.save(pedidoFabio);
        pedidoRepository.save(srm);

    }
}
