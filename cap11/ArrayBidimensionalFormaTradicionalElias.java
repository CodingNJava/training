package cap11;

public class ArrayBidimensionalFormaTradicionalElias {
	public static void main(String[] args) {
		// construindo arrays bidimensionais da forma tradicional
		int numeros [][] = new int[3][];

		int primeiro [] = new int[3];
		int segundo  [] = new int[4];
		int terceiro [] = new int[2];

		primeiro[0] = 0;
		primeiro[1] = 1;
		primeiro[2] = 1;

		segundo[0] = 0;
		segundo[1] = 1;
		segundo[2] = 1;
		segundo[3] = 2;

		terceiro[0] = 21;
		terceiro[1] = 34;

		numeros[0] = primeiro;
		numeros[1] = segundo;
		numeros[2] = terceiro;

		for (int i = 0; i < numeros.length; i++){
			System.out.println("---------------------");
			for (int j = 0; j < numeros[i].length; j++){
				System.out.println(numeros[i][j]);
			}
		}
	}
}
