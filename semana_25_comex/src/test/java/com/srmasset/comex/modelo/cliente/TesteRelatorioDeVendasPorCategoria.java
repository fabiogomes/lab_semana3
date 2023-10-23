package com.srmasset.comex.modelo.cliente;

import com.srmasset.comex.modelo.categoria.CategoriaDAO;
import com.srmasset.comex.modelo.pedido.ItemDePedido;
import com.srmasset.comex.modelo.pedido.Pedido;
import com.srmasset.comex.modelo.pedido.PedidoDAO;
import com.srmasset.comex.modelo.produto.Produto;
import com.srmasset.comex.modelo.produto.ProdutoDAO;
import com.srmasset.comex.modelo.vo.RelatorioDeVendasPorCategoria;
import com.srmasset.comex.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class TesteRelatorioDeVendasPorCategoria {
    public static void main(String[] args) {
        PopulaBanco popular = new PopulaBanco();
        popular.popular();


        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        ClienteDAO cdao = new ClienteDAO(em);
        ProdutoDAO pdao = new ProdutoDAO(em);
        Produto pcmaster = pdao.buscaPorId(1L);
        Produto pcbasico = pdao.buscaPorId(2L);
        Produto livro = pdao.buscaPorId(3L);


        PedidoDAO peddao = new PedidoDAO(em);
        Pedido pedidoDavid = new Pedido(cdao.buscaPorID("1111111111111"), BigDecimal.ZERO, Boolean.FALSE);
        pedidoDavid.adicionarItem(new ItemDePedido(1, pedidoDavid, pcmaster, BigDecimal.ZERO, "NENHUM" ));
        pedidoDavid.adicionarItem(new ItemDePedido(3, pedidoDavid, livro, BigDecimal.ZERO, "NENHUM" ));
        peddao.cadastra(pedidoDavid);

        Pedido pedidoLeonardo = new Pedido(cdao.buscaPorID("3333333333333"), BigDecimal.ZERO, Boolean.FALSE);
        pedidoLeonardo.adicionarItem(new ItemDePedido(2, pedidoLeonardo, livro, BigDecimal.ZERO, "NENHUM" ));
        pedidoLeonardo.adicionarItem(new ItemDePedido(3, pedidoLeonardo, pcbasico, BigDecimal.ZERO, "NENHUM" ));
        peddao.cadastra(pedidoLeonardo);

        Pedido pedidoFabio = new Pedido(cdao.buscaPorID("2222222222222"), BigDecimal.ZERO, Boolean.FALSE);
        pedidoFabio.adicionarItem(new ItemDePedido(1, pedidoLeonardo, livro, BigDecimal.ZERO, "NENHUM" ));
        peddao.cadastra(pedidoFabio);

        CategoriaDAO catdao = new CategoriaDAO(em);
        List<RelatorioDeVendasPorCategoria> relatCat = catdao.relatorioDeVendasPorCategoria("LIVROS");
        relatCat.forEach(rc ->{
            System.out.println(rc.getNomeCategoria());
            System.out.println(rc.getQuantidadeVendida());
            System.out.println(rc.getValorTotal());
        });

        List<RelatorioDeVendasPorCategoria> relatCat2 = catdao.relatorioDeVendasPorCategoria("INFORMATICA");
        relatCat2.forEach(rc ->{
            System.out.println(rc.getNomeCategoria());
            System.out.println(rc.getQuantidadeVendida());
            System.out.println(rc.getValorTotal());
        });

        em.getTransaction().commit();
        em.close();
    }
}
