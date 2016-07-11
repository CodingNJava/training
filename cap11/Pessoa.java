package cap11;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;

	// sobrecarga no construtor
	Pessoa() {
		setNome(nome);
		setPeso(peso);
		setAltura(altura);
	}

	Pessoa(String nome, double peso, double altura) {
		setNome(nome);
		setPeso(peso);
		setAltura(altura);
	}

	public String toString() {
		return getNome() + " " + "Idade: " + getPeso() + " " + "Altura: "
				+ getAltura();
	}

	// settando
	void setNome(String nome) {
		this.nome = nome;
	}

	void setPeso(double peso) {
		this.peso = peso;
	}

	void setAltura(double altura) {
		this.altura = altura;
	}

	// gettando
	String getNome() {
		return nome;
	}

	double getPeso() {
		return peso;
	}

	double getAltura() {
		return altura;
	}

	// mostrando dados
	String getDados() {
		return "Nome: " + getNome() + "\nPeso: " + getPeso() + "\nAltura: "
				+ getAltura();
	}

	void mostrarDados() {
		System.out.println(getDados());
		System.out.println("--------------------------------------------");
	}

}
