package cap3;

public class OperadorTernario {
	public static void main(String[] args) {
		int a = 2, b = 4;
		System.out.println(a + b > b - a ? "Sim" : "Não");
		int idade = 18;
		System.out.println(idade >= 18 ? "Você pode dirigir"
				: "Você não pode dirigir ainda");
	}
}
