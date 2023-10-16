package com.srmasset.comex.modelo.produto;

import com.srmasset.comex.modelo.categoria.Categoria;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "PRODUTO")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long COD_PRODUTO;
    private String NOME;
    private BigDecimal PRECO;
    private String DESCRICAO;
    private Integer QTD_ESTOQUE;
    @ManyToOne
    private Categoria CATEGORIA;

    public Produto(){}

    public Produto(Long cod_prod, String nome, BigDecimal preco, Categoria categoria){
        this.COD_PRODUTO = cod_prod;
        this.NOME = nome;
        this.PRECO = preco;
        this.CATEGORIA = categoria;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public BigDecimal getPRECO() {
        return PRECO;
    }

    public void setPRECO(BigDecimal PRECO) {
        this.PRECO = PRECO;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    public void setDESCRICAO(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

    public Integer getQTD_ESTOQUE() {
        return QTD_ESTOQUE;
    }

    public void setQTD_ESTOQUE(Integer QTD_ESTOQUE) {
        this.QTD_ESTOQUE = QTD_ESTOQUE;
    }

    public Categoria getCATEGORIA() {
        return CATEGORIA;
    }

    public void setCATEGORIA(Categoria CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }
}
