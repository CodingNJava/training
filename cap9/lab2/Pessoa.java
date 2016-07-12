package cap9.lab2;

public abstract class Pessoa {
	String nome;
	int idade;
	char sexo;
	RG rg;
	
	//sobrecarga de construtor
	
	Pessoa(){
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setRg(rg);
	}
	
	Pessoa(String nome, int idade, char sexo, RG rg){
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setRg(rg);
	}
	
	//getting 
	String getNome(){
		return nome;
	}
	int getIdade(){
		return idade;
	}
	char getSexo(){
		return sexo;
	}
	RG getRg(){
		return rg;
	}
	
	//setting
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public void setSexo(char sexo){
		this.sexo = sexo;
	}
	
	public void setRg(RG rg){
		this.rg = rg;
	}
	
	// metodos ---------------------------
	
	public abstract void falar (String fala);
	
	// mostrando dados

		String getDados() {
			return "Nome: " + getNome() + 
					"\nIdade: " + getIdade() +
					"\nSexo: " + getSexo() +
					"\nRg: " + getRg();
		}

		public void mostrarDados() {
			System.out.println(getDados());
		}
	
	
	
	
}
