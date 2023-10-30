package com.srmasset.comex.modelo.cliente;

import com.srmasset.comex.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class TestaMetodosClienteDAO {
    public static void main(String[] args) {
        System.out.println("Testa cadastro");

        Endereco endereco = new Endereco("RUA", "11", "BAIRRO", "CIDADE", "ESTADO");
        Cliente cliente = new Cliente("1111111111111", "DavidEdson", "111112222", endereco);
        EntityManager em = JPAUtil.getEntityManager();
        ClienteDAO cdao = new ClienteDAO(em);

        em.getTransaction().begin();
        //testa cadastra()
        cdao.cadastra(cliente);
        em.getTransaction().commit();
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("Testa listaPorNome");
        //testa listaPorNome()
        List<Cliente> teste = cdao.listaPorNome("DavidEdson");
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("Testa buscaPorID");
        //testa buscaPorID()
        teste.add(cdao.buscaPorID("1111111111111"));
        teste.forEach(c -> System.out.println(c.getNOME()));
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("Testa atualiza");
        //testa atualiza()
        em.getTransaction().begin();
        cliente.setNOME("DavidEdsonDaCruz");
        cliente.getENDERECO().setBAIRRO("BAIRRONOVO");
        cdao.atualiza(cliente);
        teste.add(cdao.buscaPorID("1111111111111"));
        teste.forEach(c -> System.out.println(c.getNOME()));
        em.getTransaction().commit();
        System.out.println("-------------------------------------------------------------------------------------------");


        System.out.println("Testa atualiza");
        //testa listaTodos()
        Endereco endereco2 = new Endereco("RUA2", "112", "BAIRRO2", "CIDADE2", "ESTADO2");
        Cliente cliente2 = new Cliente("1111111111112", "cliente2", "222222222", endereco2);

        em.getTransaction().begin();
        cdao.cadastra(cliente2);
        em.getTransaction().commit();

        List<Cliente> teste2 = cdao.listaTodos();
        teste2.forEach(c2 -> {
            System.out.println(c2.getNOME());
            System.out.println(c2.getCPF());
            System.out.println(c2.getENDERECO().getCIDADE());
            System.out.println(c2.getENDERECO().getESTADO());
            System.out.println(c2.getENDERECO().getBAIRRO());
            System.out.println(c2.getENDERECO().getRUA());
            System.out.println();
        });


    }
}
