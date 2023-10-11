package br.com.comex.domain.clientes;

import br.com.comex.ConnectionFactory;

import java.net.ConnectException;
import java.sql.Connection;
import java.util.Scanner;

public class ClienteService {
    private ConnectionFactory connection;
    public ClienteService(){
        this.connection = new ConnectionFactory();
    }

    public void salvar(DadosCriacaoCliente dadosCliente){
        Connection conn = connection.recuperarConexao();
        new ClientesDAO(conn).salvar(dadosCliente);
    }

    public void listar(){
        Connection conn = connection.recuperarConexao();
        System.out.println(new ClientesDAO(conn).listar());
    }

    public void atualizar(){
        Connection conn = connection.recuperarConexao();
        listar();
        Scanner user = new Scanner(System.in);

        System.out.println("Digite a conta que deseja atualizar: ");
        Integer cod_cliente = user.nextInt();

        System.out.println("Digite o nome: ");
        user.nextLine();
        String nome = user.nextLine();

        System.out.println("Digite o email: ");
        String email = user.nextLine();

        System.out.println("Digite o cpf: ");
        String cpf = user.nextLine();

        System.out.println("Digite o telefone 1: ");
        String tel1 = user.nextLine();

        System.out.println("Digite o telefone 2: ");
        String tel2 = user.nextLine();

        System.out.println("Digite o bairro: ");
        String bairro = user.nextLine();

        System.out.println("Digite o cidade: ");
        String cidade = user.nextLine();

        DadosCriacaoCliente cliente = new DadosCriacaoCliente(cod_cliente, nome, email, cpf, tel1, tel2, bairro, cidade);

        ClientesDAO cdao = new ClientesDAO(conn);
        cdao.atualizar(cliente);
    }

    public void deletaCliente(){
        Connection conn = connection.recuperarConexao();
        listar();
        Scanner user = new Scanner(System.in);
        System.out.println("Digite o codigo do cliente que deseja excluir: ");
        Integer cod_cliente = user.nextInt();
        ClientesDAO cdao = new ClientesDAO(conn);
        cdao.remover(cod_cliente);
    }
}
