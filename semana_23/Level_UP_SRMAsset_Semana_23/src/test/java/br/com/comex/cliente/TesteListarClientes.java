package br.com.comex.cliente;

import br.com.comex.domain.clientes.ClienteService;

public class TesteListarClientes {
    public static void main(String[] args) {
        ClienteService service = new ClienteService();
        service.listar();
    }
}
