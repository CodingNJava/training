package cap3;

public class OperadorTernario {
	public static void main(String[] args) {
		int a = 2, b = 4;
		System.out.println(a + b > b - a ? "Sim" : "N�o");
		int idade = 18;
		System.out.println(idade >= 18 ? "Voc� pode dirigir"
				: "Voc� n�o pode dirigir ainda");
	}
}
