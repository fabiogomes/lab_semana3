package com.srmasset.comex.springdata.service;

import com.srmasset.comex.springdata.orm.Categoria;
import com.srmasset.comex.springdata.orm.Cliente;
import com.srmasset.comex.springdata.orm.Produto;
import com.srmasset.comex.springdata.repository.CategoriaRepository;
import com.srmasset.comex.springdata.repository.ClienteRepository;
import com.srmasset.comex.springdata.repository.ProdutoRepository;
import com.srmasset.comex.springdata.vo.RelatorioClienteFieis;
import com.srmasset.comex.springdata.vo.RelatorioDeVendasPorCategoria;
import com.srmasset.comex.springdata.vo.RelatorioMaisVendidos;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class RelatoriosService {
    private final ClienteRepository clienteRepository;
    private final CategoriaRepository categoriaRepository;
    private final ProdutoRepository produtoRepository;

    public RelatoriosService(ClienteRepository clienteRepository,
                             CategoriaRepository categoriaRepository,
                             ProdutoRepository produtoRepository){
        this.clienteRepository = clienteRepository;
        this.categoriaRepository = categoriaRepository;
        this.produtoRepository =produtoRepository;
    }
    public void inicia(Scanner scan){
        System.out.println("O que desja fazer?");
        System.out.println("0 - Sair");
        System.out.println("1 - Buscar funcionario por nome");
        System.out.println("2 - Buscar categoria por nome");
        System.out.println("3 - Buscar produto por nome");
        System.out.println("4 - Relatorio de vendas por categoria");
        System.out.println("5 - Relatorio de Clientes fieis");
        System.out.println("6 - Relatorio produtos mais vendidos");

        int opcao = scan.nextInt();
        switch(opcao){
            case 1:
                buscarFuncionarioPorNome(scan);
                break;
            case 2:
                buscarCategoriaPorNome(scan);
                break;
            case 3:
                buscarProdutoPorNome(scan);
                break;
            case 4:
                relatorioDeVendasPorCategoria(scan);
                break;
            case 5:
                relatorioClienteFieis();
                break;
            case 6:
                relatorioMaisVendidos();
                break;
        }
    }

    private void buscarFuncionarioPorNome(Scanner scan){
        System.out.println("Qual nome deseja buscar? ");
        String nome = scan.next();
        List<Cliente> clientes = clienteRepository.findByNome(nome);
        clientes.forEach(c -> {
            System.out.println("Nome do cliente: " + c.getNome());
            System.out.println("CPF do cliente: " + c.getCpf());
            System.out.println("Telefone do cliente: " + c.getTelefone());
            System.out.println();
        });
    }

    private void buscarCategoriaPorNome(Scanner scan){
        System.out.println("Qual nome deseja buscar? ");
        String nome = scan.next();
        List<Categoria> categorias = categoriaRepository.findByNome(nome);
        categorias.forEach(c -> {
            System.out.println("Nome da categoria: " + c.getNome());
            System.out.println("Status da categoria: " + c.getStatus());
            System.out.println();
        });
    }

    private void buscarProdutoPorNome(Scanner scan){
        System.out.println("Qual nome deseja buscar? ");
        String nome = scan.next();
        List<Produto> produtos = produtoRepository.findByNome(nome);
        produtos.forEach(p -> {
            System.out.println("Nome do produto: " + p.getNome());
            System.out.println("Descrição do produto: " + p.getDescricao());
            //System.out.println("Categoria do Produto: " + p.getCategoria().getNome()); precisa de um CategoriaRepository
            System.out.println();
        });
    }

    private void relatorioDeVendasPorCategoria(Scanner scan){
        System.out.println("Qual categoria deseja buscar? ");
        String nome = scan.next();
        List<RelatorioDeVendasPorCategoria> relatorio = categoriaRepository.relatorioDeVendasPorCategoria(nome);
        relatorio.forEach(rvpc -> {
            System.out.println("Nome da categoria: " + rvpc.getNomeCategoria());
            System.out.println("Valor total: " + rvpc.getValorTotal());
            System.out.println("Quantidade vendida: " + rvpc.getQuantidadeVendida());
            System.out.println();
        });
    }

    private void relatorioClienteFieis(){
        System.out.println("Relatorio de Clientes fieis: ");
        List<RelatorioClienteFieis> clientes = clienteRepository.relatorioClienteFieis();
        clientes.forEach(rcf -> {
            System.out.println("Nome do cliente: " + rcf.getNomeCliente());
            System.out.println("Numero de pedidos: " + rcf.getNumeroPedidos());
            System.out.println("Valor total gasto: " + rcf.getValorGasto());
            System.out.println();
        });
    }

    private void relatorioMaisVendidos(){
        System.out.println("Relatorio produtos mais vendidos: ");
        List<RelatorioMaisVendidos> relatorio = produtoRepository.relatorioMaisVendidos();
        relatorio.forEach(rmv -> {
            System.out.println("Nome do produto: " + rmv.getNomeProduto());
            System.out.println("Quantidade vendida: " + rmv.getQtd());
            System.out.println("Valor total: " + rmv.getValorTotal());
            System.out.println();
        });
    }

}
