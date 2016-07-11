package cap6;

public class UsaPessoa {
	public static void main(String[] args) {
		int x;
		x = 10; // variável local de método qua contem um primito de valor 10
		System.out.println("x " + x);
		String palavra = "Sono"; // variável local de método qua contem um tipo
									// CONSTRUIDO no caso STRING

		Pessoa p; // p é uma variável local de metodo que vai guardar um
					// construido no caso PESSOA

		p = new Pessoa();// instanciar é criar objetos

		System.out.println("p: " + p);
		System.out.println("Nome de p: " + p.nome);// valor default para String
													// NULL(tipo construido é
													// sempre NULO)
		System.out.println("Idade de p: " + p.idade);// para int sempre será 0
		System.out.println("Sexo de p: " + p.sexo);
		System.out.println("Estado civil de p: " + p.estadoCivil); // valor
																	// default
																	// de
																	// boolean
																	// sempre
																	// será
																	// FALSE

		// atribuindo valores à p

		p.nome = "Victor";
		p.idade = 24;
		p.sexo = 'm';

		p.mostrarDados();

		p.setNome("João"); // settando atraves de metodo!!!
		p.setIdade(14);
		p.setSexo('m');
		p.setEstadoCivil(false);

		System.out.println("Nome de p: " + p.getNome());
		System.out.println("Idade de p: " + p.getIdade());
		System.out.println("Sexo de p: " + p.getSexo());
		System.out.println("Estado civil de p: " + p.getEstadoCivil());

	}
}
