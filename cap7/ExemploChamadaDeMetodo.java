package cap7;

public class ExemploChamadaDeMetodo {
	// por causa do static eu não preciso de objetos instanciados para executar
	// todos os metodos
	
//metodo 1
	static void executarTarefaAA() {
		System.out.println("Executando tarefa AA");
	}
	
//metodo 2
	static void executarTarefaBB() {
		System.out.println("Executando tarefa BB");
		executarTarefaAA();
	}
	

	public static void main(String args[]) {
		System.out.println("\"main\", é o ponto de partida");
		executarTarefaBB();// metodo de classe, não é necessário uma instancia
							// para chama-lo

		// ExemploChamadaDeMetodo x1 = new ExemploChamadaDeMetodo();
		// x1.executarTarefaBB();
	}
}
