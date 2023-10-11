package br.com.comex.produto;

import br.com.comex.domain.categorias.CategoriaService;
import br.com.comex.domain.categorias.DadosCriacaoCategorias;
import br.com.comex.domain.produtos.DadosCriacaoProdutos;
import br.com.comex.domain.produtos.ProdutoService;

import java.math.BigDecimal;

public class TestaAdicionarProduto {
    public static void main(String[] args) {
        DadosCriacaoProdutos dadosProduto =
                new DadosCriacaoProdutos(4, "TESTE", "DESCRICAO DE TESTE", BigDecimal.ZERO,0);
        ProdutoService service = new ProdutoService();
        service.salvar(dadosProduto);
    }
}
