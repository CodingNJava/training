package cap7;


public class Cap7_Lab3 {

	public static void main(String[] args) {
		Aluno joao = new Aluno();
		joao.setNome("João");
		Aluno.contadorDeAlunos++;
		joao.imprimeAluno();
		System.out.println("Contagem no objeto joao: " + Aluno.contadorDeAlunos + "\n");
		
		Aluno maria = new Aluno();
		maria.setNome("Maria");
		Aluno.contadorDeAlunos++;
		maria.imprimeAluno();
		System.out.println("Contagem no objeto maria: " + Aluno.contadorDeAlunos + "\n");
		
		Aluno marcos = new Aluno();
		marcos.setNome("Marcos");
		Aluno.contadorDeAlunos++;
		marcos.imprimeAluno();
		System.out.println("Contagem no objeto marcos: " + Aluno.contadorDeAlunos + "\n");
	
		// impressão usando a referência estática correta:
		System.out.println("Contador acessado diretamente da classe: " + Aluno.contadorDeAlunos);
		
	}

}
