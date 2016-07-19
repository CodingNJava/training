package cap13;

public class UsaCalculo {
	public static void main(String[] args) {
		
		Soma soma = new Soma();
		System.out.println(soma.executar(5, 10));
		
		Multiplicacao multiplicacao = new Multiplicacao();
		System.out.println(multiplicacao.executar(5, 10));
		
		Divisao divisao = new Divisao();
		System.out.println(divisao.executar(10, 5));
		
		Subtracao subtracao = new Subtracao();
		System.out.println(subtracao.executar(10, 5));
		
		
	}
}
