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
			System.out.println("\n" + numero + " É número primo.");
			System.out.println("Número de divisões possíveis: " + divisoes);
		} else {
			System.out.println("\n" + numero + " Não é número primo.");
			System.out.println("Número de divisões possíveis: " + divisoes);
		}
	}
}
