package com.srmasset.comex.springboot.api.core.vo;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public record ListaDeProdutosDoPedido(
        @NotNull Long id,
        @DecimalMin("0") Integer quantidade) {
}
