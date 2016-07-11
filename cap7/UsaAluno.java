package cap7;

public class UsaAluno {
	public static void main(String[] args) {
		Aluno joao = new Aluno();
		Aluno maria = new Aluno();
		Aluno marcos = new Aluno();

		Aluno.contadorDeAlunos++;
		joao.setNome("João");
		joao.imprimeAluno();
		System.out.println("Contagem no objeto " + joao.getNome() + " " + Aluno.contadorDeAlunos + "\n" );
		
		Aluno.contadorDeAlunos++;
		maria.setNome("Maria");
		joao.imprimeAluno();
		System.out.println("Contagem no objeto " + maria.getNome() + " " + Aluno.contadorDeAlunos + "\n" );
		
		Aluno.contadorDeAlunos++;
		marcos.setNome("Marcos");
		joao.imprimeAluno();
		System.out.println("Contagem no objeto " + marcos.getNome() + " " + Aluno.contadorDeAlunos + "\n" );
		
		System.out.println("Contador acessado diretamente da classe: "  );
	}
}

