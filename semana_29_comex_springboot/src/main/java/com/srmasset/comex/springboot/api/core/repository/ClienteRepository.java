package com.srmasset.comex.springboot.api.core.repository;

import com.srmasset.comex.springboot.api.core.orm.Categoria;
import com.srmasset.comex.springboot.api.core.orm.Cliente;
import com.srmasset.comex.springboot.api.core.orm.DadosListagemDeClientes;
import com.srmasset.comex.springboot.api.core.vo.RelatorioClienteFieis;
import com.srmasset.comex.springboot.api.core.vo.RelatorioQuantidadeComprasPorCliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String> {
    List<Cliente> findByNome(String nome);

    @Query("SELECT new com.srmasset.comex.springboot.api.core.vo.RelatorioClienteFieis(" +
            "c.nome AS NOME, COUNT(pdd.id) AS QTD_PEDIDO, SUM(pdd.valorTotal) AS VALOR_TOTAL) " +
            "FROM Pedido pdd " +
            "JOIN pdd.cliente c " +
            "GROUP BY c.nome " +
            "ORDER BY SUM(pdd.valorTotal) DESC")
    List<RelatorioClienteFieis> relatorioClienteFieis();

    @Query("SELECT new com.srmasset.comex.springboot.api.core.vo.RelatorioQuantidadeComprasPorCliente(" +
            "c.id, COUNT(pdd.id)) " +
            "FROM Pedido pdd " +
            "JOIN pdd.cliente c " +
            "WHERE c.id = :id")
    RelatorioQuantidadeComprasPorCliente relatorioQuantidadeComprasPorCliente(Long id);

    @Query("SELECT new com.srmasset.comex.springboot.api.core.orm.DadosListagemDeClientes(" +
            "c.id, c.nome, c.cpf, c.telefone, CONCAT(c.endereco.cidade, '/\', c.endereco.estado ) as local) " +
            "FROM Cliente c ")
    Page<DadosListagemDeClientes> findAll(Pageable paginacao);
}
