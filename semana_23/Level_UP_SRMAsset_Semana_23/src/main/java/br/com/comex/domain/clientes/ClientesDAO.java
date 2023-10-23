package br.com.comex.domain.clientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;


public class ClientesDAO {
    private Connection conn;

    ClientesDAO (Connection connection){
        this.conn = connection;
    }

    public void salvar(DadosCriacaoCliente dadosCliente){
        var cliente = new Cliente(dadosCliente);

        String sql = "INSERT INTO clientes (COD_CLIENTE, NOME, EMAIL, CPF, TELEFONE1, TELEFONE2, BAIRRO, CIDADE)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, dadosCliente.cod_cliente());
            ps.setString(2, dadosCliente.nome());
            ps.setString(3, dadosCliente.email());
            ps.setString(4, dadosCliente.cpf());
            ps.setString(5, dadosCliente.tel1());
            ps.setString(6, dadosCliente.tel2());
            ps.setString(7, dadosCliente.bairro());
            ps.setString(8, dadosCliente.cidade());
            ps.execute();
            ps.close();
            conn.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public Set<Cliente> listar(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Set<Cliente> clientes = new HashSet<>();

        String sql = "SELECT * FROM CLIENTES";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Integer cod_cliente = rs.getInt(1);
                String nome = rs.getString(2);
                String email = rs.getString(3);
                String cpf = rs.getString(4);
                String tel1 = rs.getString(5);
                String tel2 = rs.getString(6);
                String bairro = rs.getString(7);
                String cidade = rs.getString(8);

                DadosCriacaoCliente dadosCliente =
                        new DadosCriacaoCliente(cod_cliente, nome, email, cpf, tel1, tel2, bairro, cidade);
                Cliente cliente = new Cliente(dadosCliente);

                clientes.add(cliente);
            }

            rs.close();
            ps.close();
            conn.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return clientes;
    }

    public void atualizar(DadosCriacaoCliente dadosCliente){
        String sql = "UPDATE CLIENTES SET NOME = ?, EMAIL = ?, CPF = ?, TELEFONE1 = ?, TELEFONE2 = ?, BAIRRO = ?, CIDADE = ? " +
                "WHERE COD_CLIENTE = ?";

        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dadosCliente.nome());
            ps.setString(2, dadosCliente.email());
            ps.setString(3, dadosCliente.cpf());
            ps.setString(4, dadosCliente.tel1());
            ps.setString(5, dadosCliente.tel2());
            ps.setString(6, dadosCliente.bairro());
            ps.setString(7, dadosCliente.cidade());
            ps.setInt(8, dadosCliente.cod_cliente());
            ps.execute();
            ps.close();
            conn.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void remover(Integer numeroCliente){
        String sql = "DELETE FROM CLIENTES WHERE cod_cliente = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, numeroCliente);

            ps.execute();
            ps.close();
            conn.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
