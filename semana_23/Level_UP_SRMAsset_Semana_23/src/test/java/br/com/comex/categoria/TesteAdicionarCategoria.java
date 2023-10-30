package br.com.comex.categoria;

import br.com.comex.domain.categorias.CategoriaService;
import br.com.comex.domain.categorias.DadosCriacaoCategorias;

public class TesteAdicionarCategoria {
    public static void main(String[] args) {
        DadosCriacaoCategorias dadosCategoria =
                new DadosCriacaoCategorias(9999, "TESTE", "DESCRICAO DE TESTE");
        CategoriaService service = new CategoriaService();
        service.salvar(dadosCategoria);
    }
}
