package com.srmasset.comex.modelo.categoria;

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
}
