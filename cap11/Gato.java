package cap11;

public class Gato {
	private String nome;
	private int idade;

	// sobre carga em construtor
	Gato() {
		setNome(nome);
		setIdade(idade);
	}

	Gato(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	public String toString() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade();
	}

	// settando
	void setNome(String nome) {
		this.nome = nome;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}

	// gettando
	String getNome() {
		return nome;
	}

	int getIdade() {
		return idade;
	}

	// mostrar dados

	String getDados() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade();

	}

	void mostrarDados() {
		System.out.println(getDados());
	}

}
