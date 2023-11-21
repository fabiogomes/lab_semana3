package com.srmasset.comex.springboot.api.controller;

import com.srmasset.comex.springboot.api.core.repository.CategoriaRepository;
import com.srmasset.comex.springboot.api.core.repository.ClienteRepository;
import com.srmasset.comex.springboot.api.core.repository.PedidoRepository;
import com.srmasset.comex.springboot.api.core.repository.ProdutoRepository;
import com.srmasset.comex.springboot.api.core.service.CrudPedidoService;
import com.srmasset.comex.springboot.api.core.service.PopulaBanco;
import com.srmasset.comex.springboot.api.core.vo.DadosPedido;
import com.srmasset.comex.springboot.api.core.vo.DetalhesPedido;
import com.srmasset.comex.springboot.api.core.vo.ItensPedido;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping
    @Transactional
    public void CriaPedido(@RequestBody @Valid DadosPedido dadosPedido){
        CrudPedidoService service = new CrudPedidoService(clienteRepository, produtoRepository, pedidoRepository);
        service.criaPedido(dadosPedido);
    }

    @GetMapping("/{id}")
    public DetalhesPedido DetalhaPedido(@PathVariable Long id){
        CrudPedidoService service = new CrudPedidoService(clienteRepository, produtoRepository, pedidoRepository);
        return service.detalhaPedido(id);
    }
}
