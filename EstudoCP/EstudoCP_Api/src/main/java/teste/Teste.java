package teste;

import java.io.IOException;

import javax.swing.JOptionPane;

import model.Endereco;
import service.ViacepService;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ViacepService viacepservice = new ViacepService();
		
		//Tem que ter o {try aqui dentro instanciar }catch (IOException e){e.printStackTrace(); se nao tiver nao roda
		try {
			Endereco endereco = viacepservice.getEndereco(JOptionPane.showInputDialog("Digite o cep a ser consultado"));
			
			System.out.println(endereco);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
