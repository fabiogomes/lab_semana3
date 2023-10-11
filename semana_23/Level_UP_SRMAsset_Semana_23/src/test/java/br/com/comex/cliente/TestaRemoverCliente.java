package br.com.comex.cliente;

import br.com.comex.domain.clientes.ClienteService;

public class TestaRemoverCliente {
    public static void main(String[] args) {
        ClienteService service = new ClienteService();
        service.deletaCliente();
    }
}
