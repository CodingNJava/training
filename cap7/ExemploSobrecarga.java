package cap7;

public class ExemploSobrecarga {
	public static void main(String args[]) {
		Sobrecarga sob = new Sobrecarga();
		
		sob.mostrar("Ernesto");
		sob.mostrar("José", "Silva");
		sob.mostrar();
		sob.mostrar(38);
	}
}
