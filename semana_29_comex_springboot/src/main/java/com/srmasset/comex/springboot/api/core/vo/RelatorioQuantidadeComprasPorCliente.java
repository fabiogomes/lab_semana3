package com.srmasset.comex.springboot.api.core.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RelatorioQuantidadeComprasPorCliente {
    private long clienteId;
    private long quantidade;
}
