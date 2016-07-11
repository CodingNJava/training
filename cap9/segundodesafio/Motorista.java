package cap9.segundodesafio;

public class Motorista extends Funcionario {
	int cnh;

	public void setCnh(int cnh) {
		this.cnh = cnh;
	}
	
	int getCnh(){
		return cnh;
	}
	
	void reajustarSalario(){
		setSalario(getSalario()+200);
	}
	
	void setDados(String nome, double salario, int idade, int cnh){
		setDados(nome, salario, idade);
		setCnh(cnh);
	}
	
	void imprimir(){
		System.out.println("-----Dados do Motorista-------");
		super.imprimir();
		System.out.println("Cnh: " + getCnh());
	}
}
