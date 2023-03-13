package br.com.beans.teste;


public class TesteVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] idade = new int [4];
		
			
		try {
			idade[4] = 6;
		
			System.out.println(idade[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Foi apontado para uma posição inexistente");
		}
		
		/***********************************************************/
		
				
		/* TEM QUE IMPORTAR O SCANNER
		Scanner teclado = new Scanner(System.in);  
		  
		for (int i = 0; i<idade.length; i++ ) {
			System.out.println("Digite a "+i+"° posição do vetor: ");
			idade[i]= teclado.nextInt();
			
		}
		
		for (int x =0; x<idade.length; x++) {
			System.out.println("Posição "+x+"°" +" do vetor é: "+idade[x]);
		}*/
		
		
			
			
	}

}
