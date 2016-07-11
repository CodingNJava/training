package cap9.terceirodesafio;

public class Chefe extends Funcionario {
	String celular;

	Chefe() {
	}

	Chefe(String nome, double salario, int idade, String celular) {
		super(nome, salario, idade);// sobrecarga de construtor
		setCelular(celular);
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	String getCelular() {
		return celular;
	}

	void setDados(String nome, double salario, int idade, String celular) {
		setDados(nome, salario, idade);// sobrecarga de metodo
		setCelular(celular);
	}

	void imprimir() {
		System.out.println("-----Dados do Chefe-----------");
		super.imprimir();
		System.out.println("Celular: " + getCelular());
	}

}
