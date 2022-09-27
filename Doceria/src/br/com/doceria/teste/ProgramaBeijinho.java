package br.com.doceria.teste;

import br.com.doceria.beans.Beijinho;

public class ProgramaBeijinho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beijinho beijinho = new Beijinho();
		
		beijinho.setNome("Beijinho do vovô");
		
		beijinho.setQuantidadedeAcucar(400.3);
		
		beijinho.setQuantidadedeCoco(200.5);
		
		System.out.println(beijinho.mostrarAtributos());
		
		

	}

}
