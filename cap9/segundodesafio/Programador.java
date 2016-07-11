package cap9.segundodesafio;

public class Programador extends Funcionario {
	String linguagem;
	
	public void setLinguagem(String linguagem){
		this.linguagem = linguagem;
	}
	
	String getLinguagem(){
		return linguagem;
	}
	
	void setDados(String nome, double salario, int idade, String linguagem){
		setDados(nome, salario, idade);//sobrecarga de metodo
		setLinguagem(linguagem);
	}
	
	void imprimir(){
		System.out.println("-----Dados do Programador-----");
		super.imprimir();
		System.out.println("Linguagem: " + getLinguagem());
	}
		
	void reajustarSalario(){
		setSalario(getSalario() + 300);
	}
}
