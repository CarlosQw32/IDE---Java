package br.com.doceria.teste;

import javax.swing.JOptionPane;

import br.com.doceria.beans.Brigadeiro;

public class ProgramaBrigadeiroReceber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Brigadeiro brigadeiro = new Brigadeiro();
		
		//brigadeiro.setNome("Brigadeiro da FIAP");
		//brigadeiro.setQuantidadedeAcucar(400.5);
		
		brigadeiro.setNome(JOptionPane.showInputDialog("Digite o nome brigadeiro"));
		brigadeiro.setQuantidadeChocolate(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de chocolate")));
		brigadeiro.setQuantidadedeAcucar(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de açucar")));
		
		System.out.println(brigadeiro.mostarAtributos());

	}

}
