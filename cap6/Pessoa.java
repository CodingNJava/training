package cap6;

public class Pessoa {
	String nome; // atributo
	int idade;   // variável de instância
	char sexo;
	boolean estadoCivil;

	// var de parametro a baixo.
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setEstadoCivil(boolean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	// Retorno das variaveis
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public char getSexo() {
		return sexo;
	}

	public boolean getEstadoCivil() {
		return estadoCivil;
	}

	public void mostrarDados() {

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);
		System.out.println("----------------------------------------");

	}

}
