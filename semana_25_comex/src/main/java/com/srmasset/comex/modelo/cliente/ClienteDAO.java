package com.srmasset.comex.modelo.cliente;

import com.srmasset.comex.modelo.vo.RelatorioClienteFieis;

import javax.persistence.EntityManager;
import java.util.List;

public class ClienteDAO {
    private EntityManager em;

    public ClienteDAO(EntityManager em) {
        this.em = em;
    }

    public Cliente buscaPorID(String cpf){
        return em.find(Cliente.class, cpf);
    }

    public void cadastra(Cliente cliente) {
        this.em.persist(cliente);
    }

    public void atualiza(Cliente cliente){
        em.merge(cliente);
    }

    public void remove(Cliente cliente){
        em.merge(cliente);
        this.em.remove(cliente);
    }

    public List<Cliente> listaTodos() {
        String jpql = "SELECT p FROM Cliente p";
        return em.createQuery(jpql, Cliente.class).getResultList();
    }

    public List<Cliente> listaPorNome(String nome) {
        String jpql = "SELECT p FROM Cliente p WHERE p.NOME = :nome";
        return em.createQuery(jpql, Cliente.class)
            .setParameter("nome", nome)
                .getResultList();
    }

    public List<RelatorioClienteFieis> relatorioClienteFieis() {
        String jpql = "SELECT new com.srmasset.comex.modelo.vo.RelatorioClienteFieis(" +
                "c.NOME AS NOME, COUNT(c.NOME) AS QTD_PEDIDO, SUM(i.QUANTIDADE * i.PRECOUNITARIO) AS VALOR_TOTAL) " +
                "FROM Pedido pdd " +
                "JOIN pdd.ITENS i " +
                "JOIN i.PRODUTO p " +
                "JOIN pdd.CLIENTE c " +
                "GROUP BY c.NOME " +
                "ORDER BY SUM(i.QUANTIDADE * i.PRECOUNITARIO) DESC";
        return em.createQuery(jpql, RelatorioClienteFieis.class)
                .setMaxResults(3)
                .getResultList();
    }
}
