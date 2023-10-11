package br.com.comex.domain.categorias;

import java.util.Objects;

public class Categoria {
    private Integer cod_categoria;
    private String nome;
    private String descricao;

    public Categoria(DadosCriacaoCategorias dados){
        this.cod_categoria = dados.cod_categoria();
        this.nome = dados.nome();
        this.descricao = dados.descricao();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return cod_categoria.equals(categoria.cod_categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod_categoria);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "cod_categoria='" + cod_categoria + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public Integer getCod_categoria() {
        return cod_categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
