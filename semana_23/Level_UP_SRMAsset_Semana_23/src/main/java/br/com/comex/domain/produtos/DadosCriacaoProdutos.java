package br.com.comex.domain.produtos;

import java.math.BigDecimal;

public record DadosCriacaoProdutos(Integer cod_produto, String nome, String descricao, BigDecimal preco_unit, Integer qtd_disp) {
}