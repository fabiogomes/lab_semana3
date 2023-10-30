package com.srmasset.comex.springdata.repository;

import com.srmasset.comex.springdata.orm.Cliente;
import com.srmasset.comex.springdata.orm.Produto;
import com.srmasset.comex.springdata.vo.RelatorioMaisVendidos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
    List<Produto> findByNome(String nome);

    @Query("SELECT new com.srmasset.comex.springdata.vo.RelatorioMaisVendidos(" +
            "c.nome AS NOMECAT, SUM(itdp.quantidade) AS QUANTIDADE,  SUM((itdp.quantidade * itdp.precoUnitario)) AS MONTANTE) " +
            "FROM Pedido pdd " +
            "JOIN pdd.itens itdp " +
            "JOIN itdp.produto p " +
            "JOIN p.categoria c " +
            "GROUP BY c.nome " +
            "HAVING SUM(itdp.quantidade) > 3")
    List<RelatorioMaisVendidos> relatorioMaisVendidos();
}
