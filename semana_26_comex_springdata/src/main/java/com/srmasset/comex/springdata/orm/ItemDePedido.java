package com.srmasset.comex.springdata.orm;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "item_pedido")
public class ItemDePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "preco_unitario", nullable = false, length = 50)
    private BigDecimal precoUnitario;
    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;
    @ManyToOne(fetch = FetchType.LAZY)
    private Produto produto;
    @ManyToOne(fetch = FetchType.LAZY)
    private Pedido pedido;
    @Column(name = "desconto")
    private BigDecimal desconto;
    @Column(name = "tipo_desconto", length = 50)
    private String tipodedesconto;

    public ItemDePedido() {
    }

    public ItemDePedido(Integer quantidade, Produto produto, Pedido pedido) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.pedido = pedido;
        this.desconto = BigDecimal.ZERO;
        this.tipodedesconto = "NENHUM";
        this.precoUnitario = produto.getPreco();
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public String getTipodedesconto() {
        return tipodedesconto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public void setTipodedescont(String tipodedescont) {
        this.tipodedesconto = tipodedesconto;
    }

    @Override
    public String toString() {
        return "ItemDePedido{" +
                "id=" + id +
                ", precoUnitario=" + precoUnitario +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                ", pedido=" + pedido +
                ", desconto=" + desconto +
                ", tipodedescont='" + tipodedesconto + '\'' +
                '}';
    }
}
