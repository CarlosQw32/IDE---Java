package br.com.zoologico.teste;

import javax.swing.JOptionPane;

import br.com.zoologico.beans.Mamifero;

public class ProgramaMamifero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mamifero mamifero = new Mamifero();
		
		mamifero.setNome(JOptionPane.showInputDialog("Digite o nome do animal"));
		mamifero.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal")));
		mamifero.setQuantidadeMesesGestacao(Integer.parseInt(JOptionPane.showInputDialog("Digite quantos meses leva a gestação")));
		
		System.out.println(mamifero.mostrarAtributos());
	}

}
