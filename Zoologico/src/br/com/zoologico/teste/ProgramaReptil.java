package br.com.zoologico.teste;

import javax.swing.JOptionPane;

import br.com.zoologico.beans.Reptil;

public class ProgramaReptil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reptil reptil = new Reptil();
		
		reptil.setNome(JOptionPane.showInputDialog("Digite o nome do reptil"));
		reptil.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do reptil")));
		reptil.setQuantidadeOvos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de ovos")));
		
		System.out.println(reptil.mostrarAtributos());

	}

}
