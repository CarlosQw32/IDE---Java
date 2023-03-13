package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;


public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Carro carro = new Carro();
		
		carro.setModelo(JOptionPane.showInputDialog("Const Vazio/ Digite o modelo: "));
		carro.setMarca(JOptionPane.showInputDialog("Const Vazio/ Digite a marca: "));
		carro.setNumPassageiros(Integer.parseInt(JOptionPane.showInputDialog("Const Vazio/ Digite o numero de passageiros: ")));
		carro.setCapacidadeCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Const Vazio/ Digite a capacidade de combustivel: ")));
		
		String marca = (JOptionPane.showInputDialog("Const Cheio/ Digite o marca: "));
		String modelo = (JOptionPane.showInputDialog("Const Cheio/ Digite o modelo: "));
		int numPassageiros = (Integer.parseInt(JOptionPane.showInputDialog("Const Cheio/ Digite o numero de passageiros: ")));
		double capacidadeCombustivel = (Double.parseDouble(JOptionPane.showInputDialog("Const Cheio/ Digite a capacidade de combustivel: ")));
		
		Carro carroCheio = new Carro(marca,modelo, numPassageiros, capacidadeCombustivel);
		
		System.out.println(carroCheio.mostrarAtributos());
		
		System.out.println(carro.mostrarAtributos());
	}

}
