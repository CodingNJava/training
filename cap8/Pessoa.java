package cap8;

public class Pessoa {
	String nome;
	int idade;
	char sexo;

	Pessoa(String nome, int idade, char sexo) {
		// Jeito errado de fazer
		// this.nome = nome;
		// this.idade = idade;
		// this.sexo = sexo;

		// Jeito certo
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);

	}

	Pessoa(String nome) {

		setNome(nome);
		setIdade(idade);
		setSexo(sexo);

	}

	Pessoa() {

		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		
		System.out.println("Tente inserir seus dados de outra forma. :) ");

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
				
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;

	}

	public int getIdade() {
		return idade;
	}

	public char getSexo() {
		return sexo;
	}

	public String getDados() {
		return "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo;

	}

	public void mostrarDados() {
		System.out.println(getDados());
	}
}
