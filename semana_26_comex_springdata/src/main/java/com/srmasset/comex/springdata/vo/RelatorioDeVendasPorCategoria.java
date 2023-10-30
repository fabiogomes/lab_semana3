package com.srmasset.comex.springdata.vo;

import java.math.BigDecimal;

public class RelatorioDeVendasPorCategoria {
    private String nomeCategoria;
    private long quantidadeVendida;
    private BigDecimal valorTotal;

    public RelatorioDeVendasPorCategoria() {
    }

    public RelatorioDeVendasPorCategoria(String nomeCategoria, long quantidadeVendida, BigDecimal valorTotal) {
        this.nomeCategoria = nomeCategoria;
        this.quantidadeVendida = quantidadeVendida;
        this.valorTotal = valorTotal;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public long getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "RelatorioDeVendasPorCategoria{" +
                "nomeCategoria='" + nomeCategoria + '\'' +
                ", quantidadeVendida=" + quantidadeVendida +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
