package com.srmasset.comex.springboot.api.core.repository;

import com.srmasset.comex.springboot.api.core.orm.Produto;
import com.srmasset.comex.springboot.api.core.vo.DadosListagemProdutos;
import com.srmasset.comex.springboot.api.core.vo.RelatorioMaisVendidos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
    List<Produto> findByNome(String nome);

    @Query("SELECT new com.srmasset.comex.springboot.api.core.vo.RelatorioMaisVendidos(" +
            "c.nome AS NOMECAT, SUM(itdp.quantidade) AS QUANTIDADE,  SUM((itdp.quantidade * itdp.precoUnitario)) AS MONTANTE) " +
            "FROM Pedido pdd " +
            "JOIN pdd.itens itdp " +
            "JOIN itdp.produto p " +
            "JOIN p.categoria c " +
            "GROUP BY c.nome " +
            "HAVING SUM(itdp.quantidade) > 3")
    List<RelatorioMaisVendidos> relatorioMaisVendidos();


    @Query("SELECT new com.srmasset.comex.springboot.api.core.vo.DadosListagemProdutos(" +
            "p.id, p.nome, p.preco, p.descricao, p.quantidadeEstoque, c.id, c.nome) " +
            "FROM Produto p " +
            "JOIN p.categoria c ")
    Page<DadosListagemProdutos> findAll(Pageable paginacao);
}
