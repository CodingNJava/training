package cap9.lab;


public class CalculoAreaPoligonos {

	
	public static void main(String[] args) {
		
		Poligono [] figuras = new Poligono [4];
		figuras[0] = new Triangulo(15, 20);
		figuras[1] = new Triangulo(7, 4);
		figuras[2] = new Quadrado(10);
		figuras[3] = new Quadrado(3);
		Poligono p1 = new Triangulo (7,4);//polimorfismo de objeto
	
		for(int i = 0; i<figuras.length; i++){
			figuras[i].calcularArea();
			figuras[i].imprimir();
		}

	}
}
/*
 * Crie as classes necessárias para que a seguinte
 * saída seja executada:
 * 
 * Triangulo [altura=20.0, base=15.0, área: 150.0]
 * Triangulo [altura=4.0, base=7.0, área: 14.0]
 * Quadrado [lado=10.0, área: 100.0]
 * Quadrado [lado=3.0, área: 9.0]
 * 

 * Observação: deve ser proibida a instanciação
 * de objetos pelo supertipo Poligono
 * 
 */

