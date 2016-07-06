package cap11;

public class ExemploArrayAnonimos {

	/*
	 * Crie o método estático somar, que receba 3 variáveis doubles e retorne o resultado
	 * da soma
	 * 
	 * Faça uma sobrecarga do método somar, permitindo que ele receba um arrays
	 * de doubles
	 */
	
	static double somar(double a, double b, double c){
		return a + b + c;
	}
	
	
	//o metodo não retorna UMA ARRAY, não cometer esse erro "static double [] somar..."
	static double somar(double [] valores){
		
		double r = 0;
		
		for(int i = 0; i < valores.length; i++){
			
		r += valores[i];
				
		};
		
		return r;
		
	}


	public static void main(String[] args) {


		double[] valores = new double[] { 2, 10, 4, 3 };
		//Quando seus métodos estiverem prontos os erros abaixo vão sumir
		System.out.println("Primeiro resultado: " + somar(valores)); //usando a versão q recebe array
		System.out.println("Segundo resultado: " + somar(5, 7, 6)); //usando a versão q recebe variáveis
	}

}
