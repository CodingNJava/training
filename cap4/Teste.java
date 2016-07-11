package cap4;

public class Teste {
public static void main(String[] args) {
		double compra = 4000;
		if (compra <= 1000) {
			System.out.println("Valor à ser pago é " + compra);
		} else if (compra <= 3000){
			System.out.println(compra*0.95);
		} else {
			System.out.println(compra*0.90);
		}
	
}
}
