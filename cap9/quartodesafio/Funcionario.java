package cap9.quartodesafio;

abstract class Funcionario {
	private String nome;
	private int idade;
	private double salario;

	// sobrecarga no construtor
	Funcionario() {
		setNome(nome);
		setIdade(idade);
		setSalario(salario);
	}

	Funcionario(String nome, double salario, int idade) {
		setNome(nome);
		setIdade(idade);
		setSalario(salario);
	}

	// seting
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// getting

	String getNome() {
		return nome;
	}

	int getIdade() {
		return idade;
	}

	double getSalario() {
		return salario;
	}

	// mostrar dados

	public String getDados() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSalario: "
				+ getSalario();
	}

	void mostrarDados() {
		System.out.println(getDados());
	}

	// tornando abstract o método reajustarSalario!!!
	
	abstract void reajustarSalario();

	// imprimir Dados
	void imprimir() {
		System.out.println("Nome: " + nome + "\nIdade: " + idade
				+ "\nSalario: " + salario);
	}

	public void setDados(String nome, double salario, int idade) {
		setNome(nome);
		setSalario(salario);
		setIdade(idade);
	}

}
