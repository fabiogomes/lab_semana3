package com.srmasset.comex.springboot.api.core.vo;

import lombok.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "nome")
public class RelatorioDeVendasPorCategoria {
    private String nomeCategoria;
    private long quantidadeVendida;
    private BigDecimal valorTotal;
}
