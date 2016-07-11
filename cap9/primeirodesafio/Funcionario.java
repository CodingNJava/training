package cap9.primeirodesafio;

public class Funcionario {
	String nome;
	int idade;
	double salario;

//seting
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	//getting
	
	String getNome(){
		return nome;
	}
	
	int getIdade(){
		return idade;
	}
	
	double getSalario(){
		return salario;
	}
	
	//mostrar dados
	
	public String getDados(){
		return "Nome: "+ getNome()+
				"\nIdade: " + getIdade() +
				"\nSalario: " + getSalario();
	}
//	void mostrarDados(){
//		System.out.println(getDados());
//	} 
	void reajustarSalario(){
		salario += 100;
	}
	void imprimir(){
		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSalario: " + salario );
	}
	
	//sobrecarga de metodo
	public void setDados(String nome, double salario, int idade){
		setNome(nome);
		setIdade(idade);
		setSalario(salario);		
	}
	

	
}

