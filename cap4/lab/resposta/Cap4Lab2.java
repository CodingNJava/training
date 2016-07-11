package cap4.lab.resposta;

public class Cap4Lab2 {

	public static void main(String[] args) {

		String mes = "Fevereiro";

		switch (mes) {
		case "Janeiro":
		case "Março":
		case "Maio":
		case "Julho":
		case "Agosto":
		case "Outubro":
		case "Dezembro":
			System.out.println("O mês escolhido tem 31 dias");
			break;

		case "Fevereiro":
			System.out.println("O mês escolhido tem 28 ou 29 dias ");
			break;

		case "Abril":
		case "Junho":
		case "Setembro":
		case "Novembro":
			System.out.println("O mês escolhido tem 30 dias");

		default:
			System.out.println("O mês passado não existe!");
		}
	}
}
