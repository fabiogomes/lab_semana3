package com.srmasset.comex.springdata.repository;

import com.srmasset.comex.springdata.orm.Cliente;
import com.srmasset.comex.springdata.vo.RelatorioClienteFieis;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String> {
    List<Cliente> findByNome(String nome);

    @Query("SELECT new com.srmasset.comex.springdata.vo.RelatorioClienteFieis(" +
            "c.nome AS NOME, COUNT(pdd.id) AS QTD_PEDIDO, SUM(pdd.valorTotal) AS VALOR_TOTAL) " +
            "FROM Pedido pdd " +
            "JOIN pdd.cliente c " +
            "GROUP BY c.nome " +
            "ORDER BY SUM(pdd.valorTotal) DESC")
    List<RelatorioClienteFieis> relatorioClienteFieis();
}
