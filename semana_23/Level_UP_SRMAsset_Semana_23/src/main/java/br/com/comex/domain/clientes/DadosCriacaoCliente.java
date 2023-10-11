package br.com.comex.domain.clientes;

public record DadosCriacaoCliente(Integer cod_cliente, String nome, String email, String cpf, String tel1, String tel2, String bairro, String cidade) {
}