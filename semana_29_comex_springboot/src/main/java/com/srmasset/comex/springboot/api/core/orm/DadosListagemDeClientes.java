package com.srmasset.comex.springboot.api.core.orm;

public record DadosListagemDeClientes(
        Long id,
        String nome,
        String cpf,
        String telefone,
        String local) {
}
