package com.srmasset.comex.springboot.api.core.service;

import com.srmasset.comex.springboot.api.core.orm.Categoria;
import com.srmasset.comex.springboot.api.core.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CrudCategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CrudCategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public void ativaDesaticaCategoria(Long id){
        if(categoriaRepository.existsById(id)){
            Categoria categoria = categoriaRepository.findById(id).get();
            if(categoria.getAtivo() == Boolean.TRUE){
                categoria.setAtivo(Boolean.FALSE);
            }else {
                categoria.setAtivo(Boolean.TRUE);
            }
        }
        else{
            throw new RuntimeException("Categoria não existe");
        }
    }
}
