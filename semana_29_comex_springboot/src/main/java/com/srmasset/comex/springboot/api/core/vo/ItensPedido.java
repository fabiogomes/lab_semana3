package com.srmasset.comex.springboot.api.core.vo;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ItensPedido {
    private Long idItemPedido;
    private String produtoNome;
    private String categoriaNome;
    private Integer quantidadeItemPedido;
    private BigDecimal produtoPreco;
    private BigDecimal valorTotalItemPedido;
}
