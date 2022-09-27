package br.com.doceria.teste;

import br.com.doceria.beans.Brigadeiro;

public class ProgramaBrigadeiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Brigadeiro brigadeiro = new Brigadeiro();
		
		brigadeiro.setNome("Brigadeiro da vovó");
		
		brigadeiro.setQuantidadedeAcucar(400.3);
		
		brigadeiro.setQuantidadeChocolate(500.6);
		
		System.out.println(brigadeiro.mostarAtributos());
		
		

	}

}
