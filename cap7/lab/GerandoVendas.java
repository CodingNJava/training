package cap7.lab;

public class GerandoVendas {
	public static void main(String[] args) {
		Vendedor v;
		
		Vendedor v1 = new Vendedor();
		Vendedor v2 = new Vendedor();
		
		
		v1.setNome("João");
		v1.setPremioEquipe(200);
		v1.setPremioIndidual(500);
		
		v2.setNome("Maria");
				
		v1.mostrarDados();
		v2.mostrarDados();
		
		
		
	}
}
