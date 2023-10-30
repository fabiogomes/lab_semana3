package com.srmasset.comex.springdata.repository;

import com.srmasset.comex.springdata.orm.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {
}
