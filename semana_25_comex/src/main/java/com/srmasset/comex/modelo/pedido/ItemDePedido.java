package com.srmasset.comex.modelo.pedido;

import com.srmasset.comex.modelo.produto.Produto;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMDEPEDIDO")
public class ItemDePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "PRECOUNITARIO", nullable = false)
    private BigDecimal PRECOUNITARIO;
    @Column(name = "QUANTIDADE", nullable = false)
    private Integer QUANTIDADE;
    @ManyToOne(fetch = FetchType.LAZY)
    private Produto PRODUTO;
    @ManyToOne(fetch = FetchType.EAGER)
    private Pedido PEDIDO;
    @Column(name = "DESCONTO")
    private BigDecimal DESCONTO;
    @Column(name = "TIPODEDESCONTO")
    private String TIPODEDESCONTO;

    public ItemDePedido() {
    }

    public ItemDePedido(Integer QUANTIDADE, Pedido PEDIDO, Produto PRODUTO, BigDecimal DESCONTO, String TIPODEDESCONTO) {
        this.QUANTIDADE = QUANTIDADE;
        this.PEDIDO = PEDIDO;
        this.PRECOUNITARIO = PRODUTO.getPRECO();
        this.PRODUTO = PRODUTO;
        this.DESCONTO = DESCONTO;
        this.TIPODEDESCONTO = TIPODEDESCONTO;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getPRECOUNITARIO() {
        return PRECOUNITARIO;
    }

    public Integer getQUANTIDADE() {
        return QUANTIDADE;
    }

    public Produto getPRODUTO() {
        return PRODUTO;
    }

    public Pedido getPEDIDO() {
        return PEDIDO;
    }

    public BigDecimal getDESCONTO() {
        return DESCONTO;
    }

    public void setPRECOUNITARIO(BigDecimal PRECOUNITARIO) {
        this.PRECOUNITARIO = PRECOUNITARIO;
    }

    public void setQUANTIDADE(Integer QUANTIDADE) {
        this.QUANTIDADE = QUANTIDADE;
    }

    public void setPRODUTO(Produto PRODUTO) {
        this.PRODUTO = PRODUTO;
    }

    public void setPEDIDO(Pedido PEDIDO) {
        this.PEDIDO = PEDIDO;
    }

    public void setDESCONTO(BigDecimal DESCONTO) {
        this.DESCONTO = DESCONTO;
    }

    public void setDESCONTO(String TIPODEDESCONTO) {
        this.TIPODEDESCONTO = TIPODEDESCONTO;
    }
}
