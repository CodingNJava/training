package cap11.lab;

public class Lab2 {
	public static void main(String[] args) {

		if (args.length > 0) {

			int soma = 0;
			String texto ="";
			for (int i = 0; i < args.length; i++) {
				soma += Integer.parseInt(args[i]);
				texto += args[i];
			}
			
			double mediaValores = (soma / args.length);
			
			System.out.println("é de " + mediaValores);
		} else {
			System.out.println("Entre com valores válidos para idade");
		}

	}
}
