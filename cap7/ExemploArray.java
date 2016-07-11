package cap7;

public class ExemploArray {
	public static void main(String[] args) {

		int numeros[] = new int[3];

		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		String texto[] = new String[5];

		texto[0] = "Eu";
		texto[1] = "não";
		texto[2] = "to";
		texto[3] = "estou";
		texto[4] = "sono.";

		for (int i = 0; i < texto.length; i++) {

			System.out.print(texto[i] + " ");

		}

		// System.out.println(numeros[0] + "\n" + numeros[1] + "\n" +
		// numeros[2]);
	}
}
