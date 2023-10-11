package br.com.comex.categoria;

import br.com.comex.domain.categorias.CategoriaService;
import br.com.comex.domain.clientes.ClienteService;

public class TestaListarCategorias {
    public static void main(String[] args) {
        CategoriaService service = new CategoriaService();
        service.listar();
        service.listarOrdenado();
    }
}
