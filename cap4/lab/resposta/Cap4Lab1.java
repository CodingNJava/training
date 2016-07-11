package cap4.lab.resposta;

public class Cap4Lab1 {
	public static void main(String args[]) {
		int numero = 10; //dividendo
		int divisoes = 0; // número de divisões possível
		for (int divisor = 1; divisor <= numero; divisor++) {
			if (numero % divisor == 0){
				divisoes++;
				System.out.println(numero + " é divisível por " + divisor);
			}
		}
		if (divisoes <= 2) {
			System.out.println("\n" + numero + " é um número primo");
			System.out.println("Número de divisões possíveis: " + divisoes);
		} else {
			System.out.println("\n" + numero + " não é um número primo");
			System.out.println("Número de divisões possíveis: " + divisoes);
		}
	}
}

