package cap7.lab;

public class Vendedor {

	private String nome;//Variavel de instancia
	private static double premioEquipe = 100;//Variavel de Classe
	private double premioIndividual = 200;//Variavel de instancia
	
	//settando
	
	void setNome(String nome){
		this.nome = nome;
	}
	void setPremioEquipe(double premioEquipe){
		this.premioEquipe += premioEquipe;
	}
	void setPremioIndidual(double premioIndividual){
		this.premioIndividual += premioIndividual;
	}
	
	/*void setDados(String nome, double premioEquipe, double premioIndividual){
		setNome(nome);
		setPremioEquipe(premioEquipe);
		setPremioIndidual(premioIndividual);
	}*/
	
	//gettando
	String getNome(){
		return nome;
	}
	double getPremioEquipe(){
		return premioEquipe;
	}
	double getPremioindividual(){
		return premioIndividual;
	}
	
	//mostrar dados
	String getDados(){
		return "Nome: " + getNome() +
				"\nPremio em equipe: " + getPremioEquipe() +
				"\nPremio individual: " + getPremioindividual();
	}
	
	void mostrarDados(){
		System.out.println(getDados());
		System.out.println("----------------------------------------");
	}
	
}

