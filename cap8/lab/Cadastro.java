package cap8.lab;

public class Cadastro {
	private String nome;
	private String sobrenome;
	private int idade;

	// sobrecarga em contrutor
	
	Cadastro() {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	Cadastro(String nome, String sobrenome) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}

	Cadastro(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}

	// setttando
	void setNome(String nome) {
		this.nome = nome;
	}

	void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}

	// gettando
	String getNome() {
		return nome;
	}

	String getSobrenome() {
		return sobrenome;
	}

	int getIdade() {
		return idade;
	}

	// mostrando dados
	String getDados() {
		return "Nome: " + nome + "\nSobrenome " + sobrenome + "\nIdade " + idade;
	}

	void mostrarDados() {
		System.out.println(getDados());
	}
}
