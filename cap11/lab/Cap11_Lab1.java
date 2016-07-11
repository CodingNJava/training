package cap11.lab;


public class Cap11_Lab1 {
	public static int maiorNumero(int array[]){
		int maior = 0;
		
//		for(int i = 0; i < array.length; i++){
//			if(array[i] > maior)
//				maior = array[i];
//		}
		
		for (int i : array) {
			if (i > maior){
				maior=i;
			}
		}
		
		return maior;
	}
	
	public static void main(String args[]){
		int numeros[] = {3,2,11,4,6,9};
		int maior = maiorNumero(numeros);
		System.out.println("O maior número do array é " + maior);
	}
}
