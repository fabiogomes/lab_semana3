package com.srmasset.comex.modelo.produto;

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
}
