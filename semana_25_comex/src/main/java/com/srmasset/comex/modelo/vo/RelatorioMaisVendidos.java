package com.srmasset.comex.modelo.vo;

import java.math.BigDecimal;

public class RelatorioMaisVendidos {
    private String nomeProduto;
    private Long qtd;

    private BigDecimal valorTotal;

    public RelatorioMaisVendidos() {
    }

    public RelatorioMaisVendidos(String nomeProduto, Long qtd, BigDecimal valorTotal) {
        this.nomeProduto = nomeProduto;
        this.qtd = qtd;
        this.valorTotal = valorTotal;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Long getQtd() {
        return qtd;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return "RelatorioMaisVendidos{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", qtd=" + qtd +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
