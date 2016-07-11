package cap11.lab;

public class Lab1 {

	// inicio método
	static int maiorNumero(int[] valor) {
		int maior = 0;

		/*
		 * for (int i = 0; i < valor.length; i++) { if (valor[i] > maior) {
		 * maior = valor[i]; } } return maior; }
		 */

		//for simplificado
		for (int i : valor) {
			if (i>maior){
				maior = i;
			}
		}
		
		return maior;
	}

	// fim do método

	public static void main(String[] args) {
		int[] numeros = { 8, 7, 75, 12, 27, 35, 15 };

		int maior = maiorNumero(numeros);
		System.out.println("O maior número do Array é " + maior);
	}
}
