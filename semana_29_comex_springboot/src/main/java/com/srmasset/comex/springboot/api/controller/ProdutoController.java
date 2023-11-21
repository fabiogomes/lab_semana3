package com.srmasset.comex.springboot.api.controller;

import com.srmasset.comex.springboot.api.core.orm.DadosCadastroProduto;
import com.srmasset.comex.springboot.api.core.repository.CategoriaRepository;
import com.srmasset.comex.springboot.api.core.repository.ProdutoRepository;
import com.srmasset.comex.springboot.api.core.service.CrudProdutoService;
import com.srmasset.comex.springboot.api.core.vo.DadosListagemProdutos;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping
    @Transactional
    //@ResponseStatus(HttpStatus.BAD_REQUEST)
    public void cadastrar(@RequestBody @Valid DadosCadastroProduto dados){
        CrudProdutoService service = new CrudProdutoService(produtoRepository, categoriaRepository);
        if(service.categoriaValida(dados) == Boolean.FALSE){
            throw new RuntimeException("categoria invalida");
        }else {
            service.salvar(dados);
        }
    }

    @GetMapping("/lista")
    public Page<DadosListagemProdutos> listar(@PageableDefault(size = 5, sort = {"nome"}) Pageable paginacao) {
        CrudProdutoService service = new CrudProdutoService(produtoRepository, categoriaRepository);
        return service.listar(paginacao);
    }
}