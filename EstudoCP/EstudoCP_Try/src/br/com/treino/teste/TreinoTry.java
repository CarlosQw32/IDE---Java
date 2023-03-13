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
			}
			/*Ja o erro ArithmeticException dispara quando ha um erro matatico ex:/0 ou +a*/
			catch(ArithmeticException exc) {
				System.out.println("Ocorreu um erro pois tentou dividir por zero");
			}
			catch(ArrayIndexOutOfBoundsException exe) {
				System.out.println("tentou dividir por um vetor que nao existe" + "\n");
			}
			
			/*Tambem pode ser escrito da seguinte forma: 
			catch(ArithmeticException |ArrayIndexOutOfBoundsException exc) {
				System.out.println("tratando dois erros com apenas um catch");
			}*/
			
			/******************************************************************/
			
		int[] numer = {2, 4, 8, 16, 32, 64};
		int[] deno = {2, 2, 0, 2, 0};	
		
		for (int x=0; x<numer.length; x++) {
			try {
				System.out.println("Resulado: " + numero[i]/deno[i]);
				}
			catch (ArithmeticException exc) {
					System.out.println("Ocorreu um erro durante a execução do for,"
							+ " pois tentou dividir um número por zero");
					}
			
			/*O Throwable e um tratamento generico ele captura qualquer erro porem de forma generica
			 * ele não pode ficar acima de nenhum outro tratamento de erro*/
			catch (Throwable exc) {
				System.out.println("Ocorreu um erro.");
			}
			
			/*O finally pode ser usado para via de finalizar um bloco de codigos*/
			finally{
				System.out.println("Todos os tratamentos de erros foram feitos ");
			}
			
			/*
			 * Exception: é a super-classe de todas as classes que tratam exceções.
				NullPointerException: quando você aponta para algo que está nulo, como por
				exemplo, um atributo de um objeto nulo.
				
				ArrayIndexOutOfBoundsException: dispara quando você aponta para uma
					posição que não existe dentro de uma matriz. Exemplo, apontar para o
					elemento 11 sendo que a matriz possui 10 elementos.
					
				NumberFormatException: lança a exceção quando o formato do dado
					passado não condiz com o tipo de dado esperado, exemplo, quando digita-se
					uma letra para um tipo de dado inteiro.
					
				FileNotFoundException: quando não encontra o arquivo especificado no
					código.
					
				IllegalArgumentException: dispara quando é fornecido um parâmetro fora dos
					padrões estabelecidos, por exemplo, uma referência nula.
			 */
					
			
		}
	}
  }
}
