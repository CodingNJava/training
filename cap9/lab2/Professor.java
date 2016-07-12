package cap9.lab2;

public class Professor extends Pessoa {
	private float salario;
	private String disciplina;
	
	//sobre carga de construtor
	
	Professor(){
		setSalario(salario);
		setDisciplina(disciplina);
	}
	
	Professor(String nome, int idade, char sexo, int numeroRG, String dataNasc, float salario ){
		super(nome, idade, sexo, new RG(numeroRG,dataNasc));
		setSalario(salario);
		setDisciplina(disciplina);
	}
	
	//getting
	float getSalario(){
		return salario;
	}
	String getDisciplina(){
		return disciplina;
	}
	
	//setting
	public void setSalario(float salario){
		this.salario = salario;
	}
	public void setDisciplina(String disciplina){
		this.disciplina = disciplina;
	}
		
	public void falar(){
		System.out.println();
	}
	
	//metodos --------------------------------
	
	public void mostrarDados(){
		super.mostrarDados();
		System.out.println("Salario: " + getSalario());
		System.out.println("Disciplina: " + getDisciplina());
	}

	
	public void falar(String fala) {
		System.out.println(getNome()+ ": " + fala);		
	}
	
}
