package cap8.lab;

public class Cap8_Lab1 {
	public static void main(String[] args) {
		Cadastro c = new Cadastro();
		Cadastro c1 = new Cadastro("Claudio","Abreu");
		Cadastro c2 = new Cadastro("Lourdes","Souza", 40);
		
		c.mostrarDados();
		c1.mostrarDados();
		c2.mostrarDados();
	}
}
