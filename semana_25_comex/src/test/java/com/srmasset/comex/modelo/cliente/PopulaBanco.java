package com.srmasset.comex.modelo.cliente;

import com.srmasset.comex.modelo.categoria.Categoria;
import com.srmasset.comex.modelo.categoria.CategoriaDAO;
import com.srmasset.comex.modelo.pedido.ItemDePedido;
import com.srmasset.comex.modelo.pedido.Pedido;
import com.srmasset.comex.modelo.pedido.PedidoDAO;
import com.srmasset.comex.modelo.produto.Produto;
import com.srmasset.comex.modelo.produto.ProdutoDAO;
import com.srmasset.comex.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PopulaBanco {
    public void popular(){
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        Endereco endereco = new Endereco("RUA", "11", "BAIRRO", "CIDADE", "ESTADO");
        Endereco endereco2 = new Endereco("RUA2", "112", "BAIRRO2", "CIDADE2", "ESTADO2");
        Endereco endereco3 = new Endereco("RUA3", "221", "BAIRRO3", "CIDADE3", "ESTADO3");
        Endereco endereco4 = new Endereco("RUA4", "332", "BAIRRO4", "CIDADE4", "ESTADO4");
        Cliente cliente = new Cliente("1111111111111", "David", "111112222", endereco);
        Cliente cliente2 = new Cliente("2222222222222", "Fabio", "222223333", endereco2);
        Cliente cliente3 = new Cliente("3333333333333", "Leonardo", "444445555", endereco3);
        Cliente cliente4 = new Cliente("4444444444444", "SRM", "555554444", endereco4);


        ClienteDAO cdao = new ClienteDAO(em);
        cdao.cadastra(cliente);
        cdao.cadastra(cliente2);
        cdao.cadastra(cliente3);
        cdao.cadastra(cliente4);
        //System.out.println(cdao.listaTodos());


        CategoriaDAO catdao = new CategoriaDAO(em);
        Categoria informatica = new Categoria("INFORMATICA");
        Categoria livros = new Categoria("LIVROS");
        catdao.cadastra(informatica);
        catdao.cadastra(livros);


        ProdutoDAO pdao = new ProdutoDAO(em);
        Produto pcmaster = new Produto("X5", new BigDecimal(10000), "GAMER", 5, informatica);
        Produto livro = new Produto("BATTLE", new BigDecimal(500), "Batalhas", 10, livros);
        Produto pcbasico = new Produto("BASICO", new BigDecimal(2000), "DESKTOP", 2, informatica);
        pdao.cadastra(pcmaster);
        pdao.cadastra(pcbasico);
        pdao.cadastra(livro);


//        PedidoDAO peddao = new PedidoDAO(em);
//
//        Pedido pedidoDavid = new Pedido(cliente, new BigDecimal(0), Boolean.FALSE);
//        //pedidoDavid.adicionarItem(iten1);
//        //pedidoDavid.adicionarItem(iten2);
//        //pedidoDavid.adicionarItem(iten3);
//        pedidoDavid.adicionarItem(new ItemDePedido());
//
//        peddao.cadastra(pedidoDavid);


//        Pedido pedidoFabio = new Pedido(cliente2, new BigDecimal(0), Boolean.FALSE);
//        pedidoFabio.adicionarItem(iten1);
//        peddao.cadastra(pedidoFabio);

//        Pedido pedidoFabio2 = new Pedido(cliente2, new BigDecimal(0), Boolean.FALSE);
//        pedidoFabio2.adicionarItem(iten2);
//        peddao.cadastra(pedidoFabio2);


//        Pedido pedidoLeonardo = new Pedido(cliente3, new BigDecimal(0), Boolean.FALSE);
//        pedidoLeonardo.adicionarItem(iten1);
//        peddao.cadastra(pedidoLeonardo);

//        Pedido pedidoSRM = new Pedido(cliente4, new BigDecimal(0), Boolean.FALSE);
//        pedidoSRM.adicionarItem(iten3);
//        peddao.cadastra(pedidoSRM);

//        ItemDePedido iten1 = new ItemDePedido(1, pcmaster, new BigDecimal(0), "NENHUM");
//        ItemDePedido iten2 = new ItemDePedido(1, livro, new BigDecimal(0), "NENHUM");
//        ItemDePedido iten3 = new ItemDePedido(1, pcbasico, new BigDecimal(0), "NENHUM");

        em.getTransaction().commit();
        //System.out.println(peddao.listaTodos());
        em.close();

    }
}
