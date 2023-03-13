package teste;

public class TesteExemploManipulacaoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExemploManipulacaoString Carlos;
		Carlos = new ExemploManipulacaoString();
		
		Carlos.nomeTeste = "José Carlos da Silva";
		
		Carlos.setNomeTeste("José Carlos da Silva");
		Carlos.setNumeroTeste(1);
		
		System.out.println(Carlos.nomeTeste);
		
		//Boa pratica de declarção de variavel do tipo String
		
		String testeUm = new String("José Carlos da Silva");
		int tamanhoUm = testeUm.length();
		
		String testeDois = new String("Carlos");
				
		System.out.println("O tamanho da String é: "+tamanhoUm+"\n");
		System.out.println("01 ***************************************");
		
		//Comparando valores da String
		
		if (testeUm == testeDois) {
			System.out.println("Os dois valores são iguais, comparando " +
		"Com sinal de == "+"\n");
		}
		
		else {
			System.out.println("Os dois valores são diferentes, comparando "+
		"Com sinal de =="+"\n");
		}
		
		if (testeUm.equals(testeDois)) {
			System.out.println("Os dois valores são iguais, comparando " +
		"utilizando o .equals"+"\n");
		}
		else {
			System.out.println("Os dois valores são diferentes, comparando "+
		"utilizando o .equals"+"\n");
		}
		
		System.out.println("02 ***************************************");
		
		
		// Comparando valores da String V2
		
		String testeTres = new String("Katia");
		String tetseQuatro =  new String("katia");
		
		if (testeTres.equalsIgnoreCase(tetseQuatro)) {
			System.out.println("Os dois valores são iguais, pois "+
		"esta ignorando maiúsculas e minúsculas"+"\n");
		}
		else {
			System.out.println("Não vai entrar nesse else, pois "
					+ "estamos ignorando as letras maiúsculas e "
					+ "minúsculas"+"\n");
		}
		
		if (testeTres.equals(tetseQuatro)){
			System.out.println("\"Não vai entrar nesse if, pois está \"\r\n"
					+ "+ \"comparando letras maiúsculas e minúsculas."+"\n");
		}
		
		else {
			System.out.println("Os dois valores são diferentes, pois "
					+ "está comparando letras maiúsculas e "
					+ "minúsculas."+"\n");
		}
		
		System.out.println("03 ***************************************");
		
		//Boa prática de declaração de variável do tipo string UPPERCASE

		String testeCinco = new String("Souza".toUpperCase());
		String testeSeis = new String("Souza");
		
		
		//Comparando valores da String
		System.out.println("Valor da variável testeCinco, utilizando "
		+ "o método toUpperCase " + testeCinco+"\n");
		
		System.out.println("Valor da variável testeSeis " + testeSeis+"\n");
		
		System.out.println("04 ***************************************");
		
		//SUBSTRING
		
		System.out.print(Carlos.getNomeTeste() + " " + Carlos.getNumeroTeste() + "\n");
		System.out.print(Carlos.getNomeTeste().substring(0, 4) + " " + Carlos.getNumeroTeste()+ "\n");
		
		System.out.println("05 ***************************************");
		
		System.out.print(Carlos.getNomeTeste().substring(1, 4) + " " + Carlos.getNumeroTeste() + "\n");
		System.out.print(Carlos.getNomeTeste().substring(7) + " " + Carlos.getNumeroTeste() + "\n");
		
		System.out.println("06 ***************************************");
		
		System.out.print(Carlos.getNomeTeste().substring(0, Carlos.getNomeTeste().length()/2) + "\n");
		System.out.print(Carlos.getNomeTeste().substring(0, Carlos.getNomeTeste().length()/2 + 4) + "\n");
		
		System.out.println("07 ***************************************");
		
		System.out.print(Carlos.getNomeTeste().substring(Carlos.getNomeTeste().length()/2) + "\n");
		System.out.print(Carlos.getNomeTeste().substring(Carlos.getNomeTeste().length()/2 + 4) + "\n");
		
		System.out.println("08***************************************");
		
		if(Carlos.getNomeTeste().startsWith("JOSÉ"))
		{
		System.out.println("O nome começa com JOSÉ");
		}
		else
		{
		System.out.println("O nome não começa com JOSÉ");
		}
		
		System.out.println("09 ***************************************");
		System.out.print(Carlos.getNomeTeste().replace('A', '@'));

		
	}

}
