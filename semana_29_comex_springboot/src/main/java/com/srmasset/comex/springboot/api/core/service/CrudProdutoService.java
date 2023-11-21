package com.srmasset.comex.springboot.api.core.service;

import com.srmasset.comex.springboot.api.core.orm.Categoria;
import com.srmasset.comex.springboot.api.core.orm.DadosCadastroProduto;
import com.srmasset.comex.springboot.api.core.orm.Produto;
import com.srmasset.comex.springboot.api.core.repository.CategoriaRepository;
import com.srmasset.comex.springboot.api.core.repository.ProdutoRepository;
import com.srmasset.comex.springboot.api.core.vo.DadosListagemProdutos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Scanner;

@Service
public class CrudProdutoService {
    private ProdutoRepository produtoRepository;
    private CategoriaRepository categoriaRepository;

    public CrudProdutoService(ProdutoRepository produtoRepository, CategoriaRepository categoriaRepository){
        this.produtoRepository = produtoRepository;
        this.categoriaRepository = categoriaRepository;
    }

    public Boolean categoriaValida(DadosCadastroProduto dados){
        return categoriaRepository.existsById(dados.categoriaId());
    }


    public void salvar(DadosCadastroProduto dados){
        Categoria categoria = categoriaRepository.findById(dados.categoriaId()).get();
        Produto produto = new Produto(dados);
        produto.setCategoria(categoria);
        produtoRepository.save(produto);
    }

    public Page<DadosListagemProdutos> listar(@PageableDefault(size = 5, sort = {"nome"}) Pageable paginacao){
        return produtoRepository.findAll(paginacao);
    }
}
