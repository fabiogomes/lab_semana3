package com.srmasset.comex.springdata.orm;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Column(name = "preco")
    private BigDecimal preco;
    @Column(name = "descricao", nullable = false, length = 100)
    private String descricao;
    @Column(name = "qtd_estoque")
    private Integer quantidadeEstoque;
    @ManyToOne(fetch = FetchType.LAZY)
    private Categoria categoria;

    public Produto(){}

    public Produto(String nome, BigDecimal preco, String descricao, Integer qtd_estoque, Categoria categoria){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidadeEstoque = qtd_estoque;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", categoria=" + categoria +
                '}';
    }
}
