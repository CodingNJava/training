package cap11;

public class ArrayPessoas {

	public static void main(String[] args) {
		Pessoa guardaPessoas [] = {new Pessoa("Ana", 1.61, 48), new Pessoa("Bete", 1.55, 51), new Pessoa ("André", 1.81, 90)};
		for (Pessoa pessoa : guardaPessoas) {
			System.out.println(pessoa);
		}
	}
}

/*
 * Altere a classe Pessoa (do cap 11) para que a classe ArrayPessoas funcione exatamente como está.
 * 
 * Obs.: a classe ArrayPessoas não pode ser alterada em nada.
 * 
 * A saída deverá ser assim:
 
  	Ana:  altura: 1.61 peso: 48.0
	Bete:  altura: 1.55 peso: 51.0
	André:  altura: 1.81 peso: 90.0

 * 
 */
