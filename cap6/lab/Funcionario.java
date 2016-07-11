package cap6.lab;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private String cargo;
	private double salario;

	// settando

	void setNome(String nome) {
		this.nome = nome;
	}

	void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	void setCargo(String cargo) {
		this.cargo = cargo;
	}

	void setSalario(double salario) {
		this.salario = salario;
	}

	void setDados(String nome, String sobrenome, String cargo, double salaraio){
		
		setNome(nome);
		setSobrenome(sobrenome);
		setCargo(cargo);
		setSalario(salaraio);
		
		
	}
	
	
	// gettando

	String getNome() {
		return nome;
	}

	String getSobrenome() {
		return sobrenome;
	}

	String getCargo() {
		return cargo;
	}

	double getSalario() {
		return salario;
	}

	String getDados(){
		
		return "Nome: " + getNome() +
			   "\nSobrenome: " + getSobrenome() +
			   "\nCargo: "+ getCargo() +
			   "\nSalário: " + getSalario();
			 
		
	}
	
	void mostrarFuncionario2(){
		
		System.out.println(getDados());
		System.out.println("----------------------------------------");
	}
	//outra opção de mostrarFuncionário
	void mostrarFuncionario() {

		System.out.println("Nome: " + getNome());
		System.out.println("Sobrenome: " + getSobrenome());
		System.out.println("Cargo: " + getCargo());
		System.out.println("Salário: " + getSalario());

		System.out.println("----------------------------------------");
	}
}
