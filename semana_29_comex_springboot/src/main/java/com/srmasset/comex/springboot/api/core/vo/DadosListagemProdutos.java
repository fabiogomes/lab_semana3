package com.srmasset.comex.springboot.api.core.vo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DadosListagemProdutos {
    Long produtoId;
    String nome;
    BigDecimal preco;
    String descricao;
    Integer estoque;
    Long categoriaId;
    String nomeCategoria;
}
