package br.com.comex.produto;

import br.com.comex.domain.produtos.ProdutoService;

public class TestaListarProdutos {
    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();
        service.listar();
        service.listarOrdenado();
    }
}
