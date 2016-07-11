package cap6;

public class UsaPessoa {
	public static void main(String[] args) {
		int x;
		x = 10; // vari�vel local de m�todo qua contem um primito de valor 10
		System.out.println("x " + x);
		String palavra = "Sono"; // vari�vel local de m�todo qua contem um tipo
									// CONSTRUIDO no caso STRING

		Pessoa p; // p � uma vari�vel local de metodo que vai guardar um
					// construido no caso PESSOA

		p = new Pessoa();// instanciar � criar objetos

		System.out.println("p: " + p);
		System.out.println("Nome de p: " + p.nome);// valor default para String
													// NULL(tipo construido �
													// sempre NULO)
		System.out.println("Idade de p: " + p.idade);// para int sempre ser� 0
		System.out.println("Sexo de p: " + p.sexo);
		System.out.println("Estado civil de p: " + p.estadoCivil); // valor
																	// default
																	// de
																	// boolean
																	// sempre
																	// ser�
																	// FALSE

		// atribuindo valores � p

		p.nome = "Victor";
		p.idade = 24;
		p.sexo = 'm';

		p.mostrarDados();

		p.setNome("Jo�o"); // settando atraves de metodo!!!
		p.setIdade(14);
		p.setSexo('m');
		p.setEstadoCivil(false);

		System.out.println("Nome de p: " + p.getNome());
		System.out.println("Idade de p: " + p.getIdade());
		System.out.println("Sexo de p: " + p.getSexo());
		System.out.println("Estado civil de p: " + p.getEstadoCivil());

	}
}
