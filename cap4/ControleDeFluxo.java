package cap4;

public class ControleDeFluxo {
	public static void main(String[] args) {
		int hora = 17;
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Bom tarde!");
		} else {
			System.out.println("Boa noite!");
		}
	}
}
