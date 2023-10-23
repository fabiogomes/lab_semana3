package br.com.comex.cliente;

import br.com.comex.domain.clientes.ClienteService;

public class TesteAtualizarCliente {
    public static void main(String[] args) {
        ClienteService service = new ClienteService();
        service.atualizar();
    }
}
