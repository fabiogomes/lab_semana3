package com.srmasset.comex.springboot.api.controller;

import com.srmasset.comex.springboot.api.core.repository.CategoriaRepository;
import com.srmasset.comex.springboot.api.core.repository.ClienteRepository;
import com.srmasset.comex.springboot.api.core.repository.PedidoRepository;
import com.srmasset.comex.springboot.api.core.repository.ProdutoRepository;
import com.srmasset.comex.springboot.api.core.service.PopulaBanco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/popular/banco")
public class PopulaController{
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    private void popularBanco(){
        PopulaBanco populaBanco = new PopulaBanco(clienteRepository, categoriaRepository, produtoRepository, pedidoRepository);
        populaBanco.popular();
    }
}