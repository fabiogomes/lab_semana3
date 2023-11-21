package com.srmasset.comex.springboot.api.core.service;

import com.srmasset.comex.springboot.api.core.orm.*;
import com.srmasset.comex.springboot.api.core.repository.ClienteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Scanner;
import java.util.function.Function;

@Service
public class CrudClienteService {
    private final ClienteRepository clienteRepository;

    public CrudClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public void salvar(DadosCadastroCliente dados){
        Endereco endereco = new Endereco(dados);

        Cliente cliente = new Cliente(dados.cpf(), dados.nome(), dados.telefone(), endereco);

        clienteRepository.save(cliente);
    }

    private void deletar(Scanner scan){
        System.out.println("Digite o cpf do cliente");
        clienteRepository.deleteById(scan.next());
        System.out.println("Cliente deletado");
    }

    public Page<DadosListagemDeClientes> listar(Pageable paginacao){
        return clienteRepository.findAll(paginacao);
    }
}
