package cap9.lab;

public abstract class Poligono {
	private double area;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	void imprimir() {
		System.out.println(this);//this faz men��o ao poligono
	}

	public abstract void calcularArea();
//	void calcularArea(){
//		System.out.println("C�lculo gen�rico");
//	}
	
}
