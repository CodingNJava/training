package cap7;

public class Sobrecarga {
	void mostrar(int valor){
		System.out.println("O valor informado foi: " + valor);
	}
	
	void mostrar(String nome){
		System.out.println("Foi informado o nome: " + nome);
	}
	
	void mostrar(String nome, String sobrenome){
		System.out.println("Foi informado o nome: " + nome + " " + sobrenome);
	}
	
	void mostrar(String nome, int idade){
		System.out.println("Foi informado o nome: " + nome + " " + idade);
	}
	
	void mostrar( int idade , String nome){
		System.out.println("Foi informado o nome: " + idade + " " + nome);
	}
	
	void mostrar(){
		System.out.println("Nada foi informado!");
	}
}
