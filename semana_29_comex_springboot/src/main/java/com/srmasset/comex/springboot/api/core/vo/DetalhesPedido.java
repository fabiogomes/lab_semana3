package com.srmasset.comex.springboot.api.core.vo;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.lang.Long;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class DetalhesPedido {
    private Long pedidoId;
    private LocalDate dataPedido;
    private BigDecimal valorTotalPedido;
    private BigDecimal descontoPedido;
    private Long clienteId;
    private String clienteNome;

    private List<ItensPedido> itensPedido;

    public DetalhesPedido(Long pedidoId, LocalDate dataPedido, BigDecimal valorTotalPedido, BigDecimal descontoPedido, Long clienteId, String clienteNome) {
        this.pedidoId = pedidoId;
        this.dataPedido = dataPedido;
        this.valorTotalPedido = valorTotalPedido;
        this.descontoPedido = descontoPedido;
        this.clienteId = clienteId;
        this.clienteNome = clienteNome;
    }
}
