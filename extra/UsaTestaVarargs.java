package extra;

public class UsaTestaVarargs {
	public static void main(String[] args) {
	    TestaVarargs teste = new TestaVarargs();
	    teste.setDados(1, 2, 3, "Ana", "3232-4444","São Paulo");
	    System.out.println(teste.getDados());
	}
}
