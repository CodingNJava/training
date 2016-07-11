package cap9.quartodesafio;

public class Motorista extends Funcionario {
	int cnh;

	Motorista() {
	}

	Motorista(String nome, double salario, int idade, int cnh) {
		super(nome, salario, idade);// sobrecarga de construtor
		setCnh(cnh);
	}

	public void setCnh(int cnh) {
		this.cnh = cnh;
	}

	int getCnh() {
		return cnh;
	}

	void reajustarSalario() {
		setSalario(getSalario() + 200);
	}

	void setDados(String nome, double salario, int idade, int cnh) {
		setDados(nome, salario, idade);
		setCnh(cnh);
	}

	void imprimir() {
		System.out.println("-----Dados do Motorista-------");
		super.imprimir();
		System.out.println("Cnh: " + getCnh());
	}
}
