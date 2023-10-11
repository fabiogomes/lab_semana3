package br.com.comex.domain.produtos;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ProdutosDAO {
    private Connection conn;

    ProdutosDAO (Connection connection){
        this.conn = connection;
    }

    public void adicionar(DadosCriacaoProdutos dadosProduto) {
        String sql = "INSERT INTO PRODUTO (COD_PRODUTO, NOME, DESCRICAO, PRECO_UNITARIO, QUANTIDADE_DISPONIVEL)" +
                "VALUES (?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, dadosProduto.cod_produto());
            ps.setString(2, dadosProduto.nome());
            ps.setString(3, dadosProduto.descricao());
            ps.setBigDecimal(4, dadosProduto.preco_unit());
            ps.setInt(5, dadosProduto.qtd_disp());
            ps.execute();
            ps.close();
            conn.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void atualizar(DadosCriacaoProdutos dadosProduto) {
        String sql = "UPDATE PRODUTO SET NOME = ?, DESCRICAO = ?, PRECO_UNITARIO = ?, QUANTIDADE_DISPONIVEL = ? " +
                "WHERE COD_PRODUTO = ?";

        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dadosProduto.nome());
            ps.setString(2, dadosProduto.descricao());
            ps.setBigDecimal(3, dadosProduto.preco_unit());
            ps.setInt(4, dadosProduto.qtd_disp());
            ps.setInt(5, dadosProduto.cod_produto());
            ps.execute();
            ps.close();
            conn.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void remover(Integer numeroProduto) {
        String sql = "DELETE FROM PRODUTO WHERE COD_PRODUTO = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, numeroProduto);

            ps.execute();
            ps.close();
            conn.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public Set<Produto> listarTodos() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Set<Produto> produtos = new HashSet<>();

        String sql = "SELECT * FROM PRODUTO";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Integer cod_produto = rs.getInt(1);
                String nome = rs.getString(2);
                String descricao = rs.getString(3);
                BigDecimal preco_unit = rs.getBigDecimal(4);
                Integer qtd_disp = rs.getInt(5);

                DadosCriacaoProdutos dadosProduto =
                        new DadosCriacaoProdutos(cod_produto, nome, descricao, preco_unit, qtd_disp);
                Produto produto = new Produto(dadosProduto);

                produtos.add(produto);
            }

            rs.close();
            ps.close();
            conn.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return produtos;
    }

    public Object buscaPorID(Integer cod) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Set<Produto> produtos = new HashSet<>();

        String sql = "SELECT * FROM PRODUTO WHERE COD_PRODUTO = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cod);
            rs = ps.executeQuery();
            while(rs.next()){
                Integer cod_produto = rs.getInt(1);
                String nome = rs.getString(2);
                String descricao = rs.getString(3);
                BigDecimal preco_unit = rs.getBigDecimal(4);
                Integer qtd_disp = rs.getInt(5);

                DadosCriacaoProdutos dadosProduto =
                        new DadosCriacaoProdutos(cod_produto, nome, descricao, preco_unit, qtd_disp);
                Produto produto = new Produto(dadosProduto);

                produtos.add(produto);
            }

            rs.close();
            ps.close();
            conn.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return produtos;
    }

    public void listarTodosOrdenado() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT NOME FROM PRODUTO ORDER BY NOME";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1));
            }

            rs.close();
            ps.close();
            conn.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void listarComJoin() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT P.NOME, P.DESCRICAO, C.NOME " +
                    "FROM PRODUTO P " +
                    "INNER JOIN PRODUTOS_CATEGORIAS PC " +
                        "ON P.COD_PRODUTO = PC.COD_PRODUTO " +
                    "INNER JOIN CATEGORIA C " +
                        "ON PC.COD_CATEGORIA = C.COD_CATEGORIA";

        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Nome Produto: " + rs.getString(1));
                System.out.println("Descrição Produto: " + rs.getString(2));
                System.out.println("Nome Categoria: " + rs.getString(3));
            }

            rs.close();
            ps.close();
            conn.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
