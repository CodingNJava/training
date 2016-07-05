package cap7.lab;

public class GerandoVendas2 {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor();
		Vendedor v2 = new Vendedor();

		v1.setNome("João");
		v2.setNome("Maria");

		v1.mostrarDados();
		v2.mostrarDados();

		
		//Vendedor.premioEquipe += 400;
		
		System.out.println("Atribuindo valores aos prêmios de v1(João)");

		v1.setPremioIndidual(200);
		v1.setPremioEquipe(500);
		v1.mostrarDados();

		System.out.println("Mostrando os valores de v2 (Maria) sem ter feito atribuições");

		v2.mostrarDados();

		System.out.println("Criando v3 (Cida) testando a variável de classe");

		Vendedor v3 = new Vendedor();
		v3.setNome("Cida");
		v3.setPremioEquipe(-300);
		v3.setPremioIndidual(800);
		v3.mostrarDados();

		System.out.println("Mostrando novamente os três objetos");
		
		v1.mostrarDados();
		v2.mostrarDados();
		v3.mostrarDados();

	}

}
