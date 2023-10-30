package com.srmasset.comex.springdata.repository;

import com.srmasset.comex.springdata.orm.Categoria;
import com.srmasset.comex.springdata.vo.RelatorioDeVendasPorCategoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
    List<Categoria> findByNome(String nome);

    @Query("SELECT new com.srmasset.comex.springdata.vo.RelatorioDeVendasPorCategoria(" +
            "c.nome AS NOMECAT, SUM(itdp.quantidade) AS QUANTIDADE,  SUM((itdp.quantidade * itdp.precoUnitario)) AS MONTANTE) " +
            "FROM Pedido pdd " +
            "JOIN pdd.itens itdp " +
            "JOIN itdp.produto p " +
            "JOIN p.categoria c " +
            "WHERE c.nome = :nome " +
            "GROUP BY c.nome")
    List<RelatorioDeVendasPorCategoria> relatorioDeVendasPorCategoria(String nome);
}
