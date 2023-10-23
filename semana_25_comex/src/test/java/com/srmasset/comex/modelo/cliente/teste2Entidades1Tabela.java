package com.srmasset.comex.modelo.cliente;

import com.srmasset.comex.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class teste2Entidades1Tabela {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("RUA", "11", "BAIRRO", "CIDADE", "ESTADO");
        Cliente cliente = new Cliente("1111111111111", "DavidEdson", "111112222", endereco);
        EntityManager em = JPAUtil.getEntityManager();
        ClienteDAO cdao = new ClienteDAO(em);

        em.getTransaction().begin();
        cdao.cadastra(cliente);
        em.getTransaction().commit();
        List<Cliente> teste = cdao.listaPorNome("DavidEdson");

        teste.forEach(cliente1 -> System.out.println(cliente1.getNOME()));
        teste.forEach(cliente1 -> System.out.println(cliente1.getENDERECO().getBAIRRO()));

        em.close();
    }
}
