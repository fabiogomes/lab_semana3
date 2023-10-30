package com.srmasset.comex.springdata.service;

import com.srmasset.comex.springdata.orm.Cliente;
import com.srmasset.comex.springdata.orm.Endereco;
import com.srmasset.comex.springdata.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.Scanner;

@Service
public class CrudClienteService {
    private final ClienteRepository clienteRepository;

    public CrudClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public void inicia(Scanner scan){
        System.out.println("O que desja fazer?");
        System.out.println("0 - Sair");
        System.out.println("1 - Salvar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Deletar");
        System.out.println("4 - Listar todos");

        int opcao = scan.nextInt();
        switch(opcao){
            case 1:
                salvar(scan);
                break;
            case 2:
                atualizar(scan);
                break;
            case 3:
                deletar(scan);
                break;
            case 4:
                listarTodos();
                break;
        }
    }

    private void salvar(Scanner scan){
        System.out.println("Digite o nome do cliente: ");
        String nome = scan.next();

        System.out.println("Digite o cpf: ");
        String cpf = scan.next();

        System.out.println("Digite o telefone: ");
        String tel = scan.next();

        System.out.println("Digite o endereço: Rua: ");
        String rua = scan.next();

        System.out.println("Digite o endereço: Numero: ");
        String numero = scan.next();

        System.out.println("Digite o endereço: Complemento:  ");
        String complemento = scan.next();

        System.out.println("Digite o endereço: Bairro: ");
        String bairro = scan.next();

        System.out.println("Digite o endereço: Cidade: ");
        String cidade = scan.next();

        System.out.println("Digite o endereço: Estado: ");
        String estado = scan.next();

        Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado);

        Cliente cliente = new Cliente(cpf, nome, tel, endereco);

        clienteRepository.save(cliente);

        System.out.println("Cliente salvo");
    }

    private void atualizar(Scanner scan){
        System.out.println("Digite o nome do cliente: ");
        String nome = scan.next();

        System.out.println("Digite o cpf: ");
        String cpf = scan.next();

        System.out.println("Digite o telefone: ");
        String tel = scan.next();

        System.out.println("Digite o endereço: Rua: ");
        String rua = scan.next();

        System.out.println("Digite o endereço: Numero: ");
        String numero = scan.next();

        System.out.println("Digite o endereço: Complemento:  ");
        String complemento = scan.next();

        System.out.println("Digite o endereço: Bairro: ");
        String bairro = scan.next();

        System.out.println("Digite o endereço: Cidade: ");
        String cidade = scan.next();

        System.out.println("Digite o endereço: Estado: ");
        String estado = scan.next();

        Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado);

        Cliente cliente = new Cliente(cpf, nome, tel, endereco);

        clienteRepository.save(cliente);

        System.out.println("Cliente atualizado");
    }

    private void deletar(Scanner scan){
        System.out.println("Digite o cpf do cliente");
        clienteRepository.deleteById(scan.next());
        System.out.println("Cliente deletado");
    }

    private void listarTodos(){
        Iterable<Cliente> clientes = clienteRepository.findAll();
        clientes.forEach(p -> {
            System.out.println("CPF do cliente: " + p.getCpf().toString());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Telefone: " + p.getTelefone());
            System.out.println("Endereco rua: " + p.getEndereco().getRua());
            System.out.println("Endereço bairro: " + p.getEndereco().getBairro());
            System.out.println("Endereço cidade: " + p.getEndereco().getCidade());
            System.out.println("Endereço estado: " + p.getEndereco().getEstado());
            System.out.println();

            //System.out.println(p.toString()); LazyInitializationException
            //System.out.printf(p.getCategoria().getNome()); LazyInitializationException
        });
    }
}
