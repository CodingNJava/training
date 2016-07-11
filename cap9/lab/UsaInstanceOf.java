package cap9.lab;

public class UsaInstanceOf {

	public static void main(String[] args) {
		Poligono [] figuras = new Poligono [4];
		figuras[0] = new Triangulo(15, 20);
		figuras[1] = new Triangulo(7, 4);
		figuras[2] = new Quadrado(10);
		figuras[3] = new Quadrado(3);
		
		
	
		for(int i = 0; i<figuras.length; i++){
			if(figuras [i] instanceof Quadrado){
				System.out.println("É quadrado:" + figuras[i].getClass());
			}
			else
				System.out.println("Não é quadrado, pertence à " +  figuras[i].getClass());
		}

	}

}
