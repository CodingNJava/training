package cap9.primeirodesafio;

public class Chefe extends Funcionario {
	String celular;
	
	
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	String getCelular(){
		return celular;
	}
	
	void imprimir(){
		super.imprimir();
		System.out.println("\nCelular: " + getCelular());
	}
	
}
