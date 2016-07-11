package cap11;

public class CriandoArraySimplificado {

	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 4 };

		String nomes[] = { "Ana", "Bete", "Cida", "Denise" };

		for (int n : numeros) {
			System.out.println("-----------------");
			for (String no : nomes) {
				System.out.println(n + " " + no);
			}
		}
	}

}
