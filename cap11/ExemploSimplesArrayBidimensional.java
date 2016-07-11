package cap11;

public class ExemploSimplesArrayBidimensional {
	public static void main(String[] args) {
		int numeros[][] = { { 0, 1, 1 }, { 0, 1, 1, 2 }, { 21, 34 } };

		for (int[] n : numeros) {
			System.out.println("--------------");
			for (int n1 : n) {
				System.out.println(n1);
			}
		}

		/*
		 * for (int i = 0; i < numeros.length; i++) { for (int j = 0; j <
		 * numeros[i].length; j++) { System.out.println(numeros[i][j]); }
		 * 
		 * numeros[2][0] = 35;
		 * 
		 * }
		 */
	}
}
