package aulas.aula11;

public class UsaGato {
	public static void main(String[] args) {
		Gato g;
// criando instancias
		Gato g1 = new Gato();
		Gato g2 = new Gato();
		Gato g3 = new Gato("Mirão", 1);
//settando valores
		g1.setNome("Fifi");
		g1.setIdade(2);
		g2.setNome("Adamastor");
		g2.setIdade(1);
		
//mostrando dados
		g1.mostrarDados();
		g2.mostrarDados();
		g3.mostrarDados();
	}
}
