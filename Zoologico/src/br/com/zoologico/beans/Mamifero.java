package br.com.zoologico.beans;

public class Mamifero extends Animal{
	
	private int quantidadeMesesGestacao;

	public int getQuantidadeMesesGestacao() {
		return quantidadeMesesGestacao;
	}

	public void setQuantidadeMesesGestacao(int quantidadeMesesGestacao) {
		this.quantidadeMesesGestacao = quantidadeMesesGestacao;
	}
	
	public String mostrarAtributos(){
		return "O nome do animal é: "+ getNome() +
				"\nEle tem: " + getIdade() + " anos" +
				"\nEle tem: " + getQuantidadeMesesGestacao() + " Meses de gestação";
	}

}
