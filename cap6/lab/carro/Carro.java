package cap6.lab.carro;

public class Carro {
	String cor;
	String modelo;
	double potencia;

	// setting

	void setCor(String cor) {
		this.cor = cor;
	}

	void setModelo(String modelo) {
		this.modelo = modelo;
	}

	void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	// getting

	String getCor() {
		return cor;
	}

	String getmodelo() {
		return modelo;
	}

	double getPotencia() {
		return potencia;
	}

	void mostrarCarro() {

		System.out.println("Cor: " + getCor());
		System.out.println("modelo: " + getmodelo());
		System.out.println("Potência: " + getPotencia());

		System.out.println("----------------------------------------");
	}
}
