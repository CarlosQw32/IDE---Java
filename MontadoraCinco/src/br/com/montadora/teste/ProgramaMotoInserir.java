package br.com.montadora.teste;

import java.sql.Connection;

import be.com.montadora.dao.motoDAO;
import br.com.montadora.beans.Moto;
import br.com.montadora.conexao.Conexao;

public class ProgramaMotoInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		
		motoDAO motodao = new motoDAO(con);
		
		Moto moto = new Moto();
		
		moto.setModelo("Tiger");
		moto.setCapacidadeCombustivel(20);
		moto.setQuantidadeAdesivo(10);
		
		System.out.println(motodao.inserir(moto));
		
		Conexao.fecharConexao(con);

	}

}
