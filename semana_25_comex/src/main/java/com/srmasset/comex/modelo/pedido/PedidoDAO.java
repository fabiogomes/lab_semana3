package com.srmasset.comex.modelo.pedido;

import com.srmasset.comex.modelo.produto.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class PedidoDAO {
    private EntityManager em;

    public PedidoDAO(EntityManager em) {
        this.em = em;
    }

    public Pedido buscaPorId(Long cod_pedido){
        return em.find(Pedido.class, cod_pedido);
    }

    public void cadastra(Pedido pedido){
        em.persist(pedido);
    }

    public List<Pedido> listaTodos(){
        String jpql = "SELECT p FROM Pedido p";
        return em.createQuery(jpql, Pedido.class).getResultList();
    }

    public List<Pedido> listaIndisponiveis(){
        String jpql = "SELECT p FROM Pedidos p WHERE QTD_ESTOQUE = 0";
        return em.createQuery(jpql, Pedido.class).getResultList();
    }
}
