package br.com.zoologico.beans;

public class Reptil extends Animal {

	private int quantidadeOvos;

	public int getQuantidadeOvos() {
		return quantidadeOvos;
	}

	public void setQuantidadeOvos(int quantidadeOvos) {
		this.quantidadeOvos = quantidadeOvos;
	}
	
	public String mostrarAtributos(){
		return "O nome do animal é: "+ getNome() +
				"\nEle tem: " + getIdade() + " Anos"+
				"\nEle coloca: " + getQuantidadeOvos() + " Ovos";
	}

}
