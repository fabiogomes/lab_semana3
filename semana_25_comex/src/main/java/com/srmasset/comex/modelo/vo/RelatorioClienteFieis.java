package com.srmasset.comex.modelo.vo;

import com.srmasset.comex.modelo.pedido.ItemDePedido;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

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
