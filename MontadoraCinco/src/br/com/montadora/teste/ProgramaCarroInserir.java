package br.com.montadora.teste;

import java.sql.Connection;

import be.com.montadora.dao.CarroDAO;
import br.com.montadora.beans.Carro;
import br.com.montadora.conexao.Conexao;

public class ProgramaCarroInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		
		CarroDAO carrodao = new CarroDAO(con);
		
		Carro carro = new Carro();
		
		carro.setModelo("Jetta");
		carro.setCapacidadeCombustivel(68);
		carro.setQuantidadeJanela(6);
		
		System.out.println(carrodao.inserir(carro));
		
		Conexao.fecharConexao(con);
		

	}

}
