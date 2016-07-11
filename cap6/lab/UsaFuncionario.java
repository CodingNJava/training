package cap6.lab;

public class UsaFuncionario {
	public static void main(String[] args) {
		Funcionario f;

		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		/*
		 * f1.nome = "João"; f1.sobrenome = "Pedro"; f1.cargo ="Programador";
		 * f1.salario = 4000;
		 */
		f1.setDados("Julho", "Michelette", "Gestor Ambiental", 3500);
		
		f2.setNome("João");
		f2.setSobrenome("Pedro");
		f2.setCargo("Programador");
		f2.setSalario(4000);
		
		f3.setDados("Elias", "Simões", "Programador Java", 8500);

		f1.mostrarFuncionario();
		f2.mostrarFuncionario();
		f3.mostrarFuncionario2();

	}
}
