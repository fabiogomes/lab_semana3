package br.com.comex.cliente;

import br.com.comex.domain.clientes.Cliente;
import br.com.comex.domain.clientes.ClienteService;
import br.com.comex.domain.clientes.DadosCriacaoCliente;

public class TesteCliente {
    public static void main(String[] args) {
        DadosCriacaoCliente dadosCliente = new DadosCriacaoCliente(444444, "teste", "teste@teste.com", "44444444444", "4444444444444", "4444444444444", "bairro4", "cidade4");
        ClienteService service = new ClienteService();
        service.salvar(dadosCliente);
    }
}
