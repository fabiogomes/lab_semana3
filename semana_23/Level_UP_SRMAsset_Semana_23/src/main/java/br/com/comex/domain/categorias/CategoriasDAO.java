package br.com.comex.domain.categorias;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class CategoriasDAO {
    private Connection conn;

    private Type dados;

    CategoriasDAO (Connection connection){
        this.conn = connection;
    }

    public void adicionar(DadosCriacaoCategorias dadosCategoria) {
        var categoria = new Categoria(dadosCategoria);

        String sql = "INSERT INTO CATEGORIA (COD_CATEGORIA, NOME, DESCRICAO)" +
                "VALUES (?, ?, ?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, dadosCategoria.cod_categoria());
            ps.setString(2, dadosCategoria.nome());
            ps.setString(3, dadosCategoria.descricao());
            ps.execute();
            ps.close();
            conn.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void atualizar(DadosCriacaoCategorias dadosCategoria) {
        String sql = "UPDATE CATEGORIA SET NOME = ?, DESCRICAO = ? " +
                "WHERE COD_CATEGORIA = ?";

        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dadosCategoria.nome());
            ps.setString(2, dadosCategoria.descricao());
            ps.setInt(8, dadosCategoria.cod_categoria());
            ps.execute();
            ps.close();
            conn.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void remover(Integer numeroCategoria) {
        String sql = "DELETE FROM CATEGORIA WHERE COD_CATEGORIA = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, numeroCategoria);

            ps.execute();
            ps.close();
            conn.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public Set<Categoria> listarTodos() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Set<Categoria> categorias = new HashSet<>();

        String sql = "SELECT * FROM CATEGORIA";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Integer cod_categoria = rs.getInt(1);
                String nome = rs.getString(2);
                String descricao = rs.getString(3);

                DadosCriacaoCategorias dadosCategoria =
                        new DadosCriacaoCategorias(cod_categoria, nome, descricao);
                Categoria categoria = new Categoria(dadosCategoria);

                categorias.add(categoria);
            }

            rs.close();
            ps.close();
            conn.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return categorias;
    }

    public Object buscaPorID(Integer cod) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Set<Categoria> categorias = new HashSet<>();

        String sql = "SELECT * FROM CATEGORIA WHERE COD_CATEGORIA = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cod);
            rs = ps.executeQuery();
            while(rs.next()){
                Integer cod_categoria = rs.getInt(1);
                String nome = rs.getString(2);
                String descricao = rs.getString(3);

                DadosCriacaoCategorias dadosCategoria =
                        new DadosCriacaoCategorias(cod_categoria, nome, descricao);
                Categoria categoria = new Categoria(dadosCategoria);

                categorias.add(categoria);
            }

            rs.close();
            ps.close();
            conn.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return categorias;
    }

    public void listarTodosOrdenado() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT NOME FROM CATEGORIA ORDER BY NOME";
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
}
