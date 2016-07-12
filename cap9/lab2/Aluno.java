package cap9.lab2;

public class Aluno extends Pessoa {
	private float mensalidade;
	private String curso;

		
	// sobrecarga em construtor
	Aluno() {
		setMensalidade(mensalidade);
		setCurso(curso);
	}

	Aluno(String nome, int idade, char sexo,int numeroRG, String dataNasc, float mensalidade, String curso ) {
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		setMensalidade(mensalidade);
		setCurso(curso);
	}
	
	//getting
	float getMensalidade(){
		return mensalidade;
	}
	String getCurso(){
		return curso;
	}
	
	//setting
	public void setMensalidade(float mensalidade){
		this.mensalidade = mensalidade;
	}
	
	public void setCurso(String curso){
		this.curso = curso;
	}

	// metodos----------------------------------
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Mensalidade: " + getMensalidade());
		System.out.println("Curso: " + getCurso());
	}

	public void falar(String fala) {
		System.out.println(getNome()+ ": " + fala);
	}
}
