package com.srmasset.comex.springboot.api.core.vo;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.List;

public record DadosPedido(
    @NotNull
    Long clienteId,
    @NotNull
    BigDecimal totalPedido,
    @NotNull
    List<ListaDeProdutosDoPedido> produtos){
}


