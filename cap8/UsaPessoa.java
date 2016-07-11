package cap8;

public class UsaPessoa {
	public static void main(String[] args) {

		// Pessoa p = new Pessoa();

		// p.setNome("Elias");
		// p.setIdade(28);
		// p.setSexo('m');

		Pessoa p0 = new Pessoa();
		Pessoa p1 = new Pessoa("Zé", 17, 'm');
		Pessoa p2 = new Pessoa("Maria");

		p0.mostrarDados();
		p1.mostrarDados();
		p2.mostrarDados();

	}

}
