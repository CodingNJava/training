package cap3;

public class OperadoresIncrementaisDecrementais {
	public static void main(String args[]){
		int x = 3;
		System.out.println("resultado: " + (++x + 2)); // pré-incremental
		System.out.println("valor de x: " + x);
		
		x = 3;
		System.out.println("resultado: " + (x++ + 2)); // pós-incremental
		System.out.println("valor de x: " + x);

		System.out.println("---------------------------------------------------------");
		
		x = 3;
		System.out.println("resultado: " + (--x + 2)); // pré-decremental
		System.out.println("valor de x: " + x);
		
		x = 3;
		System.out.println("resultado: " + (x-- + 2)); // pós-decremental
		System.out.println("valor de x: " + x);
		
		int y = 5;
		
		y = 5;
		System.out.println(y++ + 2);
		System.out.println(++y + 2);
		System.out.println((y = y + 1) + 1);
		
	}
}
