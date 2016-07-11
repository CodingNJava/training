package cap9.primeirodesafio;

public class Cadastro {
	public static void main(String[] args) {
		
		//primeiro funcionario
		Funcionario f = new Funcionario();

		f.setNome("Pedro");
		f.setIdade(18);
		f.setSalario(1000);
		f.imprimir();
		System.out.println("----------------------------------------");
		f.reajustarSalario();
		f.imprimir();
		System.out.println("----------------------------------------");
		
		//proximo funcionário
		Programador p = new Programador();
		p.setNome("João");
		p.setIdade(22);
		p.setSalario(3000);
		p.setLinguagem("Java");
		p.imprimir();
		System.out.println("----------------------------------------");
		p.reajustarSalario();
		p.imprimir();
		System.out.println("----------------------------------------");
		
		//proximo funcionario
		Motorista m = new Motorista();
		
		m.setNome("Maria");
		m.setIdade(30);
		m.setSalario(3000);
		m.setCnh(32587847);
		m.imprimir();
		System.out.println("----------------------------------------");
		m.reajustarSalario();
		m.imprimir();
		System.out.println("----------------------------------------");
		
		
//		//proximo funcionario
		Chefe c = new Chefe();
		
		c.setNome("Elias");
		c.setIdade(28);
		c.setSalario(15000);
		c.setCelular("+55 11 99228-0103");
		c.imprimir();
		System.out.println("----------------------------------------");
		c.reajustarSalario();
		c.imprimir();
		System.out.println("----------------------------------------");
	}
}
