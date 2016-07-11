package cap9.terceirodesafio;

public class Programador extends Funcionario {
	String linguagem;

	// sobrecarga de herança
	Programador() {
	}

	Programador(String nome, double salario, int idade, String linguagem) {
		super(nome, salario, idade);// sobrecarga de construtor
		setLinguagem(linguagem);
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	String getLinguagem() {
		return linguagem;
	}

	void setDados(String nome, double salario, int idade, String linguagem) {
		setDados(nome, salario, idade);// sobrecarga de metodo
		setLinguagem(linguagem);
	}

	void imprimir() {
		System.out.println("-----Dados do Programador-----");
		super.imprimir();
		System.out.println("Linguagem: " + getLinguagem());
	}

	void reajustarSalario() {
		setSalario(getSalario() + 300);
	}
}
