package cap9.lab;

public class Quadrado extends Poligono {

	private double lado;
	
	public String toString(){
		return "QUadrado [lado=" + lado + ", área: " + getArea() + "]";
	}
	
	public Quadrado (double lado){
		setLado(lado);
	}
	
	public void calcularArea(){
		double resultado = lado * lado;
		setArea(resultado);
	}
	
	double getLado(){
		return lado;
	}
	
	void setLado(double lado){
		this.lado = lado;
	}

}
