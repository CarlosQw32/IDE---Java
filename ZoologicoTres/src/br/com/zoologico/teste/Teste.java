package br.com.zoologico.teste;

import br.com.zoologico.beans.Mamifero;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mamifero mamifero = new Mamifero ();
		
		mamifero.setNome("Tigre");
		mamifero.setIdade(7);
		mamifero.setMesesGestação(4);
		
		System.out.println("Nome do animal: " +  mamifero.getNome() + "\n"+
				"Idade do animal: " +mamifero.getIdade()+ "\n" +
				"Meses de gestação: " +mamifero.getMesesGestação());
		
		
	}

}
