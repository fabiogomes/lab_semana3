package br.com.comex.domain.categorias;

import br.com.comex.ConnectionFactory;

import java.sql.Connection;
import java.util.Scanner;

public class CategoriaService {
    private ConnectionFactory connection;
    public CategoriaService(){
        this.connection = new ConnectionFactory();
    }
    public void salvar(DadosCriacaoCategorias dadosCategoria){
        Connection conn = connection.recuperarConexao();
        new CategoriasDAO(conn).adicionar(dadosCategoria);
    }

    public void listar(){
        Connection conn = connection.recuperarConexao();
        System.out.println(new CategoriasDAO(conn).listarTodos());
    }

    public void listarOrdenado(){
        Connection conn = connection.recuperarConexao();
        new CategoriasDAO(conn).listarTodosOrdenado();
    }

    public void atualizar(){
        Connection conn = connection.recuperarConexao();
        listar();
        Scanner user = new Scanner(System.in);

        System.out.println("Digite o codigo da categoria que deseja atualizar: ");
        Integer cod_categoria = user.nextInt();

        System.out.println("Digite o nome: ");
        user.nextLine();
        String nome = user.nextLine();

        System.out.println("Digite a descrição: ");
        String descricao = user.nextLine();

        DadosCriacaoCategorias categoria = new DadosCriacaoCategorias(cod_categoria, nome, descricao);

        CategoriasDAO cdao = new CategoriasDAO(conn);
        cdao.atualizar(categoria);
    }

    public void deletaCategoria(){
        Connection conn = connection.recuperarConexao();
        listar();
        Scanner user = new Scanner(System.in);
        System.out.println("Digite o codigo da categoria que deseja excluir: ");
        Integer cod_categoria = user.nextInt();
        CategoriasDAO cdao = new CategoriasDAO(conn);
        cdao.remover(cod_categoria);
    }
}
