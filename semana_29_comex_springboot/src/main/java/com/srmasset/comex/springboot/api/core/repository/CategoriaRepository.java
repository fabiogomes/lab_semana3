package com.srmasset.comex.springboot.api.core.repository;

import com.srmasset.comex.springboot.api.core.orm.Categoria;
import com.srmasset.comex.springboot.api.core.vo.RelatorioDeVendasPorCategoria;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
    List<Categoria> findByNome(String nome);
    @Query("SELECT new com.srmasset.comex.springboot.api.core.vo.RelatorioDeVendasPorCategoria(" +
            "c.nome, SUM(itdp.quantidade),  SUM((itdp.quantidade * itdp.precoUnitario))) " +
            "FROM Pedido pdd " +
            "JOIN pdd.itens itdp " +
            "JOIN itdp.produto p " +
            "JOIN p.categoria c " +
            "GROUP BY c.nome")
    List<RelatorioDeVendasPorCategoria> relatorioDeVendasPorCategoria();

    Page<Categoria> findAllByAtivoTrue(Pageable paginacao);
}
