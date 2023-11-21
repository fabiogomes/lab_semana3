package com.srmasset.comex.springboot.api.core.vo;

import java.math.BigDecimal;

public class RelatorioClienteFieis {
    private String nomeCliente;
    private long numeroPedidos;
    private BigDecimal valorGasto;

    public RelatorioClienteFieis() {
    }

    public RelatorioClienteFieis(String nomeCliente, long numeroPedidos, BigDecimal valorGasto) {
        this.nomeCliente = nomeCliente;
        this.numeroPedidos = numeroPedidos;
        this.valorGasto = valorGasto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public long getNumeroPedidos() {
        return numeroPedidos;
    }

    public BigDecimal getValorGasto() {
        return valorGasto;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumeroPedidos(long numeroPedidos) {
        this.numeroPedidos = numeroPedidos;
    }

    public void setValorGasto(BigDecimal valorGasto) {
        this.valorGasto = valorGasto;
    }

    @Override
    public String toString() {
        return "RelatorioClienteFieis{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numeroPedidos=" + numeroPedidos +
                ", valorGasto=" + valorGasto +
                '}';
    }
}
