package cap11;

public class ArrayBidimensional {

	public static void main(String args[]) {

		double notas[][] = new double[4][3];
		// 4 é a quantidade de alunos
		// 3 é a quantidade de notas

		notas[0][0] = 6.5; // Primeira nota do primeiro aluno
		notas[0][1] = 7.5; // Segunda nota do primeiro aluno
		notas[0][2] = 7.0; // Terceira nota do primeiro aluno

		notas[1][0] = 5.4; // Primeira nota do segundo aluno
		notas[1][1] = 9.0; // Segunda nota do segundo aluno
		notas[1][2] = 4.1; // Terceira nota do segundo aluno

		notas[2][0] = 7.2; // Primeira nota do terceiro aluno
		notas[2][1] = 8.6; // Segunda nota do terceiro aluno
		notas[2][2] = 6.5; // Terceira nota do terceiro aluno

		notas[3][0] = 7.2; // Primeira nota do quarto aluno
		notas[3][1] = 8.6; // Segunda nota do quarto aluno
		notas[3][2] = 6.5; // Terceira nota do quarto aluno

		for (int i = 0; i < notas.length; i++) { // esta linha corre o primeiro arraj
			for (int j = 0; j < notas[i].length; j++) { // essa segunda corre a arraj dentro da arraj
				System.out.println(notas[i][j]); // printando os dois arrajs
			}
		}

	}
}
