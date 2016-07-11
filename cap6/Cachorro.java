package cap6;

public class Cachorro {
	private String raca; // encapsulamento
	private String nome;
	private int idade;
	private char sexo;

	// settando
	void setRaca(String raca) {
		this.raca = raca;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}

	void setSexo(char sexo) {
		this.sexo = sexo;

	}

	void setDados(String nome, String raca, int idade, char sexo) {

		setRaca(raca);
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);

	}

	// gettando
	String getRaca() {
		return raca;
	}

	String getNome() {
		return nome;
	}

	int getIdade() {
		return idade;
	}

	char getSexo() {
		return sexo;
	}

	
	// mostrando dados
	 
	String getDados() {

		return "Nome: " + getNome() +
			   "\nIdade: "+ getIdade() + 
			   "\nSexo: " + getSexo() + 
			   "\nRaça: " + getRaca();

	}
	
	void mostrarCachorro2(){
		
		System.out.println(getDados());
	}

	void mostrarCachorro() {

		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Raça: " + getRaca());

		System.out.println("----------------------------------------");
	}
	
	void criarCachorro(){
		
	}

}
