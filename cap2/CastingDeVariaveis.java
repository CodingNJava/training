package cap2;

public class CastingDeVariaveis {

	public static void main(String[] args) {
		int ano = 2016;
		long anoAtual = ano; // do menor para o maior tipo=> casting natural(auto-casting)

		float salarioMinimo = 2000.50f;
		double salarioTotal = salarioMinimo; // do menor tipo para o maior => casting natural
											// (auto-casting)

		System.out.println("ano: " + ano);
		System.out.println("anoAtual: " + anoAtual);
		System.out.println("salarioMinimo: " + salarioMinimo);
		System.out.println("salarioTotal: " + salarioTotal);

		System.out.println("------------------------------------------------------------------------");

		long ano1 = 2016;
		int anoAtual1 = (int) ano1;

		double salarioMinimo1 = 3500.79;
		float salarioTotal1 = (float) salarioMinimo1; // do maior tipo para o menor => casting explícito
													  // ou "casting por coerção"

		System.out.println("ano1: "+ ano1);
		System.out.println("anoAtual1: " + anoAtual1);
		System.out.println("salarioMinimo1: "+ salarioMinimo1);
		System.out.println("salarioTotal1: "+ salarioTotal1);

		System.out.println("------------------------------------------------------------------------");

		int a = 2000;
		float b = a; //casting natural
		System.out.println("b: " + b);

		float f = 1234.88f;
		int i = (int) f; // casting por coerção

		System.out.println("i: " + i);

		int x = 9;
		int y = 2;
		
		float resultado = x/y; // casting natural
		System.out.println("resultado: " + resultado);

		float resultado1 = (float)x/y; // casting por coerção
		System.out.println("resultado1: " + resultado1);
	}
}
