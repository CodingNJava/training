package cap11.lab;

public class Lab2 {
	public static void main(String[] args) {

		int idade = Integer.parseInt(args[0]);
		
		
		if (idade > 0) {
			
			int soma = 0;
			for(int i = 0;i < args.length;i++){
				soma += Integer.parseInt(args[i]);
				System.out.println("A média das idades: " + "\n" +args[i]);
				
			}
			double mediaValores = (soma/4);
			System.out.println("é de " + mediaValores);
		} else {
			System.out.println("Entre com valores válidos para idade");
		}
		
	}
}
