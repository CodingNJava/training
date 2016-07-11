package cap9.primeirodesafio;

public class Programador extends Funcionario {
	String linguagem;

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	String getLinguagem() {
		return linguagem;
	}

	// herdando classes
	
	void setDados(String nome, double salario, int idade, String linguagem){
		super.setDados(nome, salario, idade);
		
	}
	
	void imprimir() {
		super.imprimir();
		System.out.println("Linguagem: " + getLinguagem());
	}

	void reajustarSalario() {
		salario += 300;
	}
}
