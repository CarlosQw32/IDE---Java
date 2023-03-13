package teste;

public class ExemploManipulacaoString {

	public String nomeTeste;
	public int numeroTeste;
	
	
	public ExemploManipulacaoString(){
		
	}
	
	//No caso de construtor a manipulaçao e feita no retorno na caso no get
	public ExemploManipulacaoString(String recebeNomeTeste, int recebeNumeroTeste) {
		this.nomeTeste = recebeNomeTeste.toUpperCase();
		this.numeroTeste = recebeNumeroTeste;
	}

	// Adiconei o upperCase na saida do dado assim ele so mostra em maiúscula mas
	// armazena do jeito original
	// O resto da pagina foi gerada pelo getter and setters
	public String getNomeTeste() {
		return nomeTeste.toUpperCase();
	}

	public void setNomeTeste(String nomeTeste) {
		this.nomeTeste = nomeTeste;
	}

	public int getNumeroTeste() {
		return numeroTeste;
	}

	public void setNumeroTeste(int numeroTeste) {
		this.numeroTeste = numeroTeste;
	}

}
