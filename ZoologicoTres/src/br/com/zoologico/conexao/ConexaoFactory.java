package br.com.zoologico.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		
		 Connection conexao = null;
	        String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	        conexao = DriverManager.getConnection(url, "rm97385", "050801");
	        System.out.println("Abriu a conexão");
	        conexao.close();
	    
		
	}

}
