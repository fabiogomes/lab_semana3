package com.srmasset.comex.modelo.produto;

import com.srmasset.comex.modelo.categoria.Categoria;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "PRODUTO")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String NOME;
    private BigDecimal PRECO;
    private String DESCRICAO;
    private Integer QTD_ESTOQUE;
    @ManyToOne(fetch = FetchType.LAZY)
    private Categoria CATEGORIA;

    public Produto(){}

    public Produto(String nome, BigDecimal preco, String descricao, Integer qtd_estoque, Categoria categoria){
        this.NOME = nome;
        this.PRECO = preco;
        this.DESCRICAO = descricao;
        this.QTD_ESTOQUE = qtd_estoque;
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

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", NOME='" + NOME + '\'' +
                '}';
    }
}
