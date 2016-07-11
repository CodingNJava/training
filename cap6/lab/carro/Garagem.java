package cap6.lab.carro;

public class Garagem {

	Carro carroPasseio = new Carro();
	Carro carroUtilitario = new Carro();

	public static void main(String[] args) {
		Garagem g = new Garagem();
		
		g.carroPasseio.setCor("Vermelho");
		g.carroPasseio.setModelo("VW Jetta");
		g.carroPasseio.setPotencia(2.3);
		
		g.carroUtilitario.setCor("Branco");
		g.carroUtilitario.setModelo("Renault Boxer");
		g.carroUtilitario.setPotencia(3.8);
		
		System.out.println("Carro de Passeio ");
		g.carroPasseio.mostrarCarro();
		
		System.out.println("Carro Utilitário ");
		g.carroUtilitario.mostrarCarro();
	
//		Carro c;

//		Garagem g1 = new Garagem();
//		Garagem g2 = new Garagem();
//		Carro c1 = new Carro();
//		Carro c2 = new Carro();
//		g1.carroPasseio = "Carro de Passeio";
//		c1.setCor("Vermelho");
//		c1.setModelo("VW Jetta");
//		c1.setPotencia(2.3);
//		
//		g1.carroPasseio = c1;
//
//		g2.carroUtilitario = "Carro Utilitário";
//		c2.setCor("Branco");
//		c2.setModelo("Renault Boxer");
//		c2.setPotencia(3.6);
//
//		System.out.println(g1.carroPasseio);
//		c1.mostrarCarro();
//
//		System.out.println(g2.carroUtilitario);
//		c2.mostrarCarro();

	}
}
