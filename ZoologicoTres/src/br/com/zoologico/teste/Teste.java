package br.com.zoologico.teste;

import java.sql.Connection;

import br.com.zoologico.beans.Mamifero;
import br.com.zoologico.conexao.Conexao;
import br.com.zoologico.dao.MamiferoDAO;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		MamiferoDAO mamiferoDAO = new MamiferoDAO(con);
		
		
		Mamifero mamifero = new Mamifero ();
		
		mamifero.setNome("Leão");
		mamifero.setIdade(2);
		mamifero.setMesesGestação(4);
		
		System.out.println(mamiferoDAO.inserir(mamifero));
		
		/*System.out.println("Nome do animal: " +  mamifero.getNome() + "\n"+
				"Idade do animal: " +mamifero.getIdade()+ "\n" +
				"Meses de gestação: " +mamifero.getMesesGestacao());*/
		
		
	}

}
