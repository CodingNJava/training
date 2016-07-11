package cap7;

public class Cap7_Lab2 {
public static void main(String[] args) {
		
	Calculadora c; 
	
	Calculadora c1 = new Calculadora();
	
	System.out.println("Métodos subtrair sobrecarregados:" + 
						"\nChamando a versão de subtrair com 2 double: " + c1.subtrair(4.2, 1.1) +
						"\nChamando a versão de subtrair com 1 double e um int: " + c1.subtrair(5.2, 1) + 
						"\nChamando a versão de subtrair com 1 int e 1 double: " + c1.subtrair(9 , 6.2));
}
}
