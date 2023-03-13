package br.com.fiap.beans;

public class Carro extends Veiculo {
	
	private double capacidadeCombustivel;
	
	public Carro() {
		
	}
	
	public Carro(String receberMarca,String receberModelo,int receberNumPassageiros, double capacidadeCombustivel) {
		
		super (receberMarca, receberModelo, receberNumPassageiros);
		
		setCapacidadeCombustivel(capacidadeCombustivel);
	}

	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	
	public String mostrarAtributos() {
		return "Atibutos Const cheio"+"\n"+
				"Marca: "+getMarca()+"\n"+
				"Modelo: "+getModelo()+"\n"+
				"Numero de passageiros: " +getNumPassageiros()+"\n"+
				"Capcidade de combustivel: " +getCapacidadeCombustivel()+"\n";
		}
	
	

}
