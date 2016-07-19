package cap13;



public class ConjuntoLambdas {
	public static void main(String[] args) {
		OperacaoAritimetica[] calculos = {(x, y) -> x + y, (x, y) -> x - y,
				(x, y) -> x * y, (x, y) -> x / y };
		
		for (OperacaoAritimetica c1 : calculos) {
			
			System.out.println(c1.executar(10, 2));
			;
			
			
		}
	}
}
