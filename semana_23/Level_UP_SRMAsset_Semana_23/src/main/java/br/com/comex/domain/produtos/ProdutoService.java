package br.com.comex.domain.produtos;

import br.com.comex.ConnectionFactory;
import br.com.comex.domain.categorias.CategoriasDAO;
import br.com.comex.domain.categorias.DadosCriacaoCategorias;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Scanner;

public class ProdutoService {
    private ConnectionFactory connection;
    public ProdutoService()
    {
        this.connection = new ConnectionFactory();
    }
    public void salvar(DadosCriacaoProdutos dadosProdutos){
        Connection conn = connection.recuperarConexao();
        new ProdutosDAO(conn).adicionar(dadosProdutos);
    }

    public void listar(){
        Connection conn = connection.recuperarConexao();
        System.out.println(new ProdutosDAO(conn).listarTodos());
    }

    public void listarOrdenado(){
        Connection conn = connection.recuperarConexao();
        new ProdutosDAO(conn).listarTodosOrdenado();
    }

    public void atualizar(){
        Connection conn = connection.recuperarConexao();
        listar();
        Scanner user = new Scanner(System.in);

        System.out.println("Digite o codigo do produto que deseja atualizar: ");
        Integer cod_produto = user.nextInt();

        System.out.println("Digite o nome: ");
        user.nextLine();
        String nome = user.nextLine();

        System.out.println("Digite a descrição: ");
        String descricao = user.nextLine();

        System.out.println("Digite o preço unitario: ");
        BigDecimal preco_unit = user.nextBigDecimal();

        System.out.println("Digite a quantidade disponivel: ");
        Integer qtd_disp = user.nextInt();

        DadosCriacaoProdutos produto = new DadosCriacaoProdutos(cod_produto, nome, descricao, preco_unit, qtd_disp);

        ProdutosDAO pdao = new ProdutosDAO(conn);
        pdao.atualizar(produto);
    }

    public void deletarProduto(){
        Connection conn = connection.recuperarConexao();
        listar();
        Scanner user = new Scanner(System.in);
        System.out.println("Digite o codigo do produto que deseja excluir: ");
        Integer cod_produto = user.nextInt();
        ProdutosDAO pdao = new ProdutosDAO(conn);
        pdao.remover(cod_produto);
    }

    public void listaComJoin(){
        Connection conn = connection.recuperarConexao();
        ProdutosDAO pdao = new ProdutosDAO(conn);
        pdao.listarComJoin();
    }
}
