package com.srmasset.comex.modelo.produto;

import com.srmasset.comex.modelo.vo.RelatorioDeVendasPorCategoria;
import com.srmasset.comex.modelo.vo.RelatorioMaisVendidos;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDAO {
    private EntityManager em;

    public ProdutoDAO(EntityManager em) {
        this.em = em;
    }

    public Produto buscaPorId(Long cod_produto){
        return em.find(Produto.class, cod_produto);
    }

    public void cadastra(Produto produto){
        em.persist(produto);
    }

    public List<Produto> listaTodos(){
        String jpql = "SELECT p FROM Produto p";
        return em.createQuery(jpql, Produto.class).getResultList();
    }

    public List<Produto> listaIndisponiveis(){
        String jpql = "SELECT p FROM Produto p WHERE QTD_ESTOQUE = 0";
        return em.createQuery(jpql, Produto.class).getResultList();
    }

    public List<RelatorioMaisVendidos> maisVendidos(){
        String jpql = "SELECT new com.srmasset.comex.modelo.vo.RelatorioMaisVendidos(" +
                "c.NOME AS NOMECAT, SUM(itdp.QUANTIDADE) AS QUANTIDADE,  SUM((itdp.QUANTIDADE * itdp.PRECOUNITARIO)) AS MONTANTE) " +
                "FROM Pedido pdd " +
                "JOIN pdd.ITENS itdp " +
                "JOIN itdp.PRODUTO p " +
                "JOIN p.CATEGORIA c " +
                "GROUP BY c.NOME " +
                "HAVING SUM(itdp.QUANTIDADE) > 3";
        return em.createQuery(jpql, RelatorioMaisVendidos.class)
                .getResultList();
    }
}
