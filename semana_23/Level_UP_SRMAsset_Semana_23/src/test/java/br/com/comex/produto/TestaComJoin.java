package br.com.comex.produto;

import br.com.comex.domain.produtos.ProdutoService;

public class TestaComJoin {
    public static void main(String[] args) {
        ProdutoService ps = new ProdutoService();
        ps.listaComJoin();
    }
}
