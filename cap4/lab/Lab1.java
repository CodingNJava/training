package cap4.lab;

public class Lab1 {
	public static void main(String[] args) {
		int numero = 40;
		int divisoes = 0;

		for (int i = 1; i <= 337; i++) {
			if (i % numero == 0) {
				divisoes++;
			}
		}

		if (divisoes <= 2) {
			System.out.println("\n" + numero + " � n�mero primo.");
			System.out.println("N�mero de divis�es poss�veis: " + divisoes);
		} else {
			System.out.println("\n" + numero + " N�o � n�mero primo.");
			System.out.println("N�mero de divis�es poss�veis: " + divisoes);
		}
	}
}
