package cap11;

public class UsaGato {
	public static void main(String[] args) {
		Gato g;

		Gato g1 = new Gato();
		Gato g2 = new Gato();
		// Gato g3 = new Gato("Mirão", 1);

		g1.setNome("Fifi");
		g1.setIdade(2);
		// g2.setNome("Adamastor");
		// g2.setIdade(1);
		System.out.println(g1);
		System.out.println(g2);
		g1.mostrarDados();
		g2.mostrarDados();
		// g3.mostrarDados();
	}
}
