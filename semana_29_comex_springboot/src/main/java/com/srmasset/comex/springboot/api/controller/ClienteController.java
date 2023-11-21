package com.srmasset.comex.springboot.api.controller;

import com.srmasset.comex.springboot.api.core.orm.DadosCadastroCliente;
import com.srmasset.comex.springboot.api.core.orm.DadosListagemDeClientes;
import com.srmasset.comex.springboot.api.core.repository.ClienteRepository;
import com.srmasset.comex.springboot.api.core.service.CrudClienteService;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import javax.transaction.Transactional;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroCliente dados){
        CrudClienteService service = new CrudClienteService(repository);
        service.salvar(dados);
    }

    @GetMapping("/lista")
    public Page<DadosListagemDeClientes> listar(@PageableDefault(size = 5, sort = {"nome"}) Pageable paginacao){
        CrudClienteService service = new CrudClienteService(repository);
        return service.listar(paginacao);
    }
}
