package com.srmasset.comex.springboot.api.core.orm;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "produto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
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

    public Produto(String nome, BigDecimal preco, String descricao, Integer qtd_estoque, Categoria categoria){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidadeEstoque = qtd_estoque;
        this.categoria = categoria;
    }

    public Produto(DadosCadastroProduto dados) {
        this.nome = dados.nome();
        this.preco = dados.preco();
        this.descricao = dados.descricao();
        this.quantidadeEstoque = dados.estoque();
    }
}
