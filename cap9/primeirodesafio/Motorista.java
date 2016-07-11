package cap9.primeirodesafio;

public class Motorista extends Funcionario {
	int cnh;

	public void setCnh(int cnh) {
		this.cnh = cnh;
	}
	
	int getCnh(){
		return cnh;
	}
	
	void reajustarSalario(){
		salario += 200;
	}
	
	void imprimir(){
		super.imprimir();
		System.out.println("\nCnh: " + getCnh());
	}
}
