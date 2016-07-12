package cap9.lab;

public class RG {
	private int numero;
	private String dataNasc;
	
	
	public String toString() {
		return "Número RG:" + numero + "\nData de Nascimento: " + dataNasc ;
	}

	public RG(int numero, String dataNasc){
		this.numero = numero;
		this.dataNasc = dataNasc;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
}
