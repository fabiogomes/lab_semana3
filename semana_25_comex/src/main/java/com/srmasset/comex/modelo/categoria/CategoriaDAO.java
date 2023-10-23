package com.srmasset.comex.modelo.categoria;

import  com.srmasset.comex.modelo.vo.RelatorioDeVendasPorCategoria;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoriaDAO {
    private EntityManager em;

    public CategoriaDAO(EntityManager em) {
        this.em = em;
    }

    public Categoria buscarPorId(Long cod_categoria){
        return em.find(Categoria.class, cod_categoria);
    }

    public void cadastra(Categoria categoria){
        em.persist(categoria);
    }

    public List<Categoria> listaTodas(){
        String jpql = "SELECT c FROM Categoria c";
        return em.createQuery(jpql, Categoria.class).getResultList();
    }

    public List<RelatorioDeVendasPorCategoria> relatorioDeVendasPorCategoria(String categoria){
        String jpql = "SELECT new com.srmasset.comex.modelo.vo.RelatorioDeVendasPorCategoria(" +
                "c.NOME AS NOMECAT, SUM(itdp.QUANTIDADE) AS QUANTIDADE,  SUM((itdp.QUANTIDADE * itdp.PRECOUNITARIO)) AS MONTANTE) " +
                "FROM Pedido pdd " +
                "JOIN pdd.ITENS itdp " +
                "JOIN itdp.PRODUTO p " +
                "JOIN p.CATEGORIA c " +
                "WHERE c.NOME = :nome " +
                "GROUP BY c.NOME";
        return em.createQuery(jpql, RelatorioDeVendasPorCategoria.class)
                .setParameter("nome", categoria)
                .getResultList();
    }
}
