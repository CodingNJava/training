package cap9.lab2;

public class RG {
	private int numeroRG;
	private String dataNasc;

	// sobrecarga de construtor
	RG() {
		setNumero(numeroRG);
		setDataNasc(dataNasc);
	}

	RG(int numero, String dataNasc) {
		setNumero(numero);
		setDataNasc(dataNasc);
	}

	// getting
	int getNumero() {
		return numeroRG;
	}

	String getDataNasc() {
		return dataNasc;
	}

	// setting
	public void setNumero(int numeroRG) {
		this.numeroRG = numeroRG;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	// mostrando dados

	String getDados() {
		return "Número: " + getNumero() + 
				"\nData de Nascimento: " + getDataNasc();
	}

	public void mostrarDados() {
		System.out.println(getDados());
	}

}
