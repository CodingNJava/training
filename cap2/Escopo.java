package cap2;

public class Escopo {
	public static void main(String[] args) {
		String nome = "Ana";
		System.out.println(nome);
		{
			int idade = 10;
			System.out.println("nome " + nome);
			System.out.println("idade " + idade);
		}// fim de um escopo interno
		
		System.out.println("nome " + nome);
		//System.out.println("idade" + idade); fora do escopo
	}// fim do escopo metodo main

}// fim do escopo da classe
