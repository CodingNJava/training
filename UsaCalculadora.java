package cap7;

public class UsaCalculadora {
	public static void main(String[] args) {
		
		
		// Conversão de String para double
		double v1 = Double.parseDouble(args[0]);
		double v2 = Double.parseDouble(args[1]);
		
		System.out.println(Calculadora.somar(v1, v2));
		System.out.println(Calculadora.subtrair(v1, v2));
		System.out.println(Calculadora.dividir(v1, v2));
		System.out.println(Calculadora.multiplicar(v1, v2));

	}
}
