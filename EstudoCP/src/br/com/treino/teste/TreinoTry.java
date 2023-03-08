package br.com.treino.teste;

public class TreinoTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
		int [] vetor = new int[3];
		
		vetor[3] = 1;
		
		System.out.println("Obrigado por utilizar esse progrma ");
				
		/*ArrayIndexOutOfBoundsException dispara quando você aponta para uma
		posição que não existe dentro de uma matriz*/
		}catch(ArrayIndexOutOfBoundsException exception){System.out.println("funcionou"+"\n");}
		
		/*************************************************************************/
		
		int[] numero = {2, 4, 8, 16, 32, 64};
		int[] denom = {2, 2, 0, 2, 0};
		
		for (int i=0; i<numero.length; i++) {
			try {			
			System.out.println("resultado: " + numero[i]/denom[i]);
			}/*
			catch(ArithmeticException exc) {
				System.out.println("Ocorreu um erro pois tentou dividir por zero");
			}
			catch(ArrayIndexOutOfBoundsException exe) {
				System.out.println("tentou dividir por um vetor que nao existe" + "\n");
			}*/
			
			/*Tambem pode ser escrito da seguinte forma: */
			catch(ArithmeticException |ArrayIndexOutOfBoundsException exc) {
				System.out.println("tratando dois erros com apenas um catch");
			}
					

		}
	}

}
