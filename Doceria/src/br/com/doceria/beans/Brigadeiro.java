package br.com.doceria.beans;

public class Brigadeiro extends Doce {

	private double quantidadeChocolate;

	public double getQuantidadeChocolate() {
		return quantidadeChocolate;
	}

	public void setQuantidadeChocolate(double quantidadeChocolate) {
		this.quantidadeChocolate = quantidadeChocolate;
	}
	public String mostarAtributos() {
		return "O nome do doce é " + getNome() +
				"\nNa composição vai " + getQuantidadedeAcucar() + " de açucar " +
				"\nE tambem vai " + getQuantidadeChocolate() + " de chocolate";
	}

}
