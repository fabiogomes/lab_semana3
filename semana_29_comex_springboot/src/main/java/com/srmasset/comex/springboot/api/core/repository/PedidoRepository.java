package com.srmasset.comex.springboot.api.core.repository;

import com.srmasset.comex.springboot.api.core.orm.Pedido;
import com.srmasset.comex.springboot.api.core.vo.DetalhesPedido;
import com.srmasset.comex.springboot.api.core.vo.ItensPedido;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {

    @Query("SELECT new com.srmasset.comex.springboot.api.core.vo.DetalhesPedido(" +
            "pdd.id, pdd.datacadastro, pdd.valorTotal,  pdd.desconto, c.id, c.nome) " +
            "from ItemDePedido itp " +
            "join itp.pedido pdd " +
            "join itp.produto p " +
            "join pdd.cliente c " +
            "join p.categoria cat " +
            "where pdd.id = :id " +
            "group by pdd.id")
    DetalhesPedido DetalhaPedido(Long id);

    @Query("SELECT new com.srmasset.comex.springboot.api.core.vo.ItensPedido(" +
            "itp.id, p.nome, cat.nome, itp.quantidade, p.preco, ((1+itp.desconto)*itp.quantidade*p.preco)) " +
            "from ItemDePedido itp " +
            "join itp.pedido pdd " +
            "join itp.produto p " +
            "join pdd.cliente c " +
            "join p.categoria cat " +
            "where pdd.id = :id")
    List<ItensPedido> DetalhaItensPedido(Long id);
}
