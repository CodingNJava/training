package cap4.lab;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		double salario = 2000;
		double ir = 0;

		if (salario <= 1903.98)
			ir = 0;
		else if (salario <= 2826.65)
			ir = salario * 0.075 - 142;
		else if (salario <= 3751.05)
			ir = salario * 0.15 - 354.80;
		else if (salario <= 4664.68)
			ir = salario * 0.22 - 636.13;
		else
			ir = salario * 0.275 - 869.36;

		System.out.println("Salário: " + salario + "\n" + "ir: " + ir);
	}

}

/*
 * Baseando-se na tabela a seguir, desenvolver um código que retorne o valor do
 * imposto de renda de um salário de R$ 4.000,00.
 * 
 * Faixa salarial........................Alíquota....................Parcela a
 * deduzir
 * 
 * Até 1.903,98 - - De 1.903,99 até 2.826,65 7,5% 142,80 De 2.826,66 até
 * 3.751,05 15% 354,80 De 3.751,06 até 4.664,68 22% 636,13 Acima de 4.664,68
 * 27,5% 869,36
 */
