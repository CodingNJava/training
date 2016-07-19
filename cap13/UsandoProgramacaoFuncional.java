package cap13;

public class UsandoProgramacaoFuncional {
	
	public static void main(String[] args) {
		
		OperacaoAritimetica operacao = (x, y) -> x + y;
		double resultado = operacao.executar(20, 5);
		System.out.println(resultado);

		OperacaoAritimetica operacao1 = (x, y) -> x * y;
		double resultado1 = operacao1.executar(20, 5);
		System.out.println(resultado1);

		OperacaoAritimetica operacao2 = (x, y) -> x / y;
		double resultado2 = operacao2.executar(20, 5);
		System.out.println(resultado2);

		OperacaoAritimetica operacao3 = (x, y) -> x - y;
		double resultado3 = operacao3.executar(20, 5);
		System.out.println(resultado3);
	}
}
