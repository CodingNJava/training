package cap7;

public class Calculadora {

	static double somar(double v1, double v2) {
		return v1 + v2;
	}

	// SOBRECARGA NO SUBTRAIR
	static double subtrair(double v1, double v2) {
		return v1 - v2;
	}

	//static double subtrair(int v1, double v2) {
		// v1 - v2;
	//}

	//static double subtrair(double v1, int v2) {
		//return v1 - v2;
	//}

	// FIM DA SOBRECARGA SUBTRAIR

	static double multiplicar(double v1, double v2) {
		return v1 * v2;
	}

	static double dividir(double v1, double v2) {
		return v1 / v2;
	}
}
