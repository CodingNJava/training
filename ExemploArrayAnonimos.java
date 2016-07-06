package cap11;

public class ExemploArrayAnonimos {

	/*
	 * Crie o m�todo est�tico somar, que receba 3 vari�veis doubles e retorne o resultado
	 * da soma
	 * 
	 * Fa�a uma sobrecarga do m�todo somar, permitindo que ele receba um arrays
	 * de doubles
	 */
	
	static double somar(double a, double b, double c){
		return a + b + c;
	}
	
	
	//o metodo n�o retorna UMA ARRAY, n�o cometer esse erro "static double [] somar..."
	static double somar(double [] valores){
		
		double r = 0;
		
		for(int i = 0; i < valores.length; i++){
			
		r += valores[i];
				
		};
		
		return r;
		
	}


	public static void main(String[] args) {


		double[] valores = new double[] { 2, 10, 4, 3 };
		//Quando seus m�todos estiverem prontos os erros abaixo v�o sumir
		System.out.println("Primeiro resultado: " + somar(valores)); //usando a vers�o q recebe array
		System.out.println("Segundo resultado: " + somar(5, 7, 6)); //usando a vers�o q recebe vari�veis
	}

}
