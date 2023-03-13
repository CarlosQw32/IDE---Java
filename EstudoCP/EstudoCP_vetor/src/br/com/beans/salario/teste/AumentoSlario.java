package br.com.beans.salario.teste;

import javax.swing.JOptionPane;

public class AumentoSlario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] salario = new double[3];
		double[] aumento = { 1.15, 1.10 };
		try {
			for (int i = 0; i < salario.length; i++) {
				salario[i] = (double) Double.parseDouble(
						JOptionPane.showInputDialog("Digite o salario para a posição " + i + "° do vetor: "));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Tentativa de inserir valor em posição inexistente! ");
		} catch (NumberFormatException e) {
			System.out.println("Digite um valor condizente com o solicitado! ");
		}

		for (int x = 0; x < salario.length; x++) {

			if (salario[x] > 2000) {
				salario[x] = salario[x] * aumento[1];
			}

			if (salario[x] <= 2000) {
				salario[x] = salario[x] * aumento[0];
			}
			
			

		}

		for (int y = 0; y < salario.length; y++) {
			System.out.println("O " + y + "° salario é : " + salario[y]);
		}

	}
}