package br.com.doceria.beans;

public class Beijinho extends Doce {

	private double quantidadedeCoco;

	public double getQuantidadedeCoco() {
		return quantidadedeCoco;
	}

	public void setQuantidadedeCoco(double quantidadedeCoco) {
		this.quantidadedeCoco = quantidadedeCoco;
	}
	
	public String mostrarAtributos() {
		return "O nome do doce � " + getNome() +
				"\nEle e composto por " + getQuantidadedeAcucar() + " de a�ucar" +
				"\nE tambem e vai " + getQuantidadedeCoco() + " de chocolate";
	}

}
