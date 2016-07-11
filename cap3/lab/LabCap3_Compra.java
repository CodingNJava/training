package cap3.lab;

public class LabCap3_Compra {
	public static void main(String[] args) {
		double compra = 4000;
		double valorApagar = compra <= 1000 ? compra :
								compra >= 1001 ? compra	- (compra * 0.05) :
								compra >= 3000 ? compra - (compra * 0.10) : 
								compra - (compra * 0.05);

		System.out.println("Valor à pagar com desconto é " + valorApagar);

	}
}
