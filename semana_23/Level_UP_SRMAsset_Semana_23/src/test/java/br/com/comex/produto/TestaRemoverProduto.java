package br.com.comex.produto;

import br.com.comex.domain.categorias.CategoriaService;
import br.com.comex.domain.produtos.ProdutoService;

public class TestaRemoverProduto {
    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();
        service.deletarProduto();
    }
}
