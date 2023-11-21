package com.srmasset.comex.springboot.api.core.orm;

import com.srmasset.comex.springboot.api.core.orm.Categoria;

public record DadosListagemCategorias(Long id, String nome) {
    public DadosListagemCategorias(Categoria categoria){
        this(categoria.getId(), categoria.getNome());
    }
}
