package br.com.comex.domain.produtos;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {
    private Integer cod_produto;
    private String nome;
    private String descricao;
    private BigDecimal preco_unit;
    private Integer qtd_disp;

    public Produto(DadosCriacaoProdutos dados){
        this.cod_produto = dados.cod_produto();
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.preco_unit = dados.preco_unit();
        this.qtd_disp = dados.qtd_disp();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return cod_produto.equals(produto.cod_produto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod_produto);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cod_produto='" + cod_produto + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preço unitario='" + preco_unit + '\'' +
                ", quantidade disponivel='" + qtd_disp + '\'' +
                '}';
    }

    public Integer getCod_produto() {
        return cod_produto;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco_unit() {
        return preco_unit;
    }

    public Integer getQtd_disp() {
        return qtd_disp;
    }
}
