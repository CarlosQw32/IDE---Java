package br.com.zoologico.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public static Connection abrirConexao() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
            final String USER = "rm97385";
            final String PASS = "050801";
            con = DriverManager.getConnection(url, USER, PASS);
            System.out.println("Conexao aberta");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage() + "Erro no envio dos dados");
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "Erro no envio dos dados");
        }
        return con;
    }
    
    public static void fecharConexao(Connection con) {
        try {
            con.close();
            System.out.println("Conexão fechada");
        } catch (SQLException e) {
            System.out.println(e.getMessage() + " Erro para fechar");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Erro para fechar");
        }
    }
}
