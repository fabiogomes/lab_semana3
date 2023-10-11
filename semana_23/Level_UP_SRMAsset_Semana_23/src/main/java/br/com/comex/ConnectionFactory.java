package br.com.comex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

//    public static void main(String[] args) {
//        try {
//            DriverManager
//                    .getConnection("jdbc:sqlserver://10.174.1.92;encrypt=false;databaseName=COMEX;integratedSecurity=false;user=sa;password=Dec@pp6jy");
//            System.out.println("Conexão estabelecida");
//        }catch(SQLException e){
//            System.out.println(e);
//            //throw new RuntimeException(e);
//        }
//    } //Testa conexao com Microsoft SQL Server

    public Connection recuperarConexao(){
        try {
            return DriverManager
                    .getConnection("jdbc:sqlserver://10.174.1.92;encrypt=false;databaseName=COMEX;integratedSecurity=false;user=sa;password=Dec@pp6jy");
            //System.out.println("Conexão estabelecida");
        }catch(SQLException e){
            //System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
