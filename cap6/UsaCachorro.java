package cap6;

public class UsaCachorro {
	public static void main(String[] args) {
		Cachorro c;

		Cachorro c1 = new Cachorro();
		Cachorro c2 = new Cachorro();
		Cachorro c3 = new Cachorro();
		Cachorro c4 = new Cachorro();
		
		
		
		// settando atraves de metodo!!!
		c1.setRaca("BullTerrier");
		c1.setNome("Massaranduba");
		c1.setIdade(4);
		c1.setSexo('m');

		c2.setRaca("BullTerrier");
		c2.setNome("Minaj");
		c2.setIdade(3);
		c2.setSexo('f');
		
		c3.setNome("Lord");
		c3.setRaca("BullDog Francês");
		c3.setIdade(2);
		c3.setSexo('f');
		
		c4.setDados("Vira-lata", "Péti", 1, 'm');
		
		c1.mostrarCachorro();
		c2.mostrarCachorro();
		c3.mostrarCachorro();
		c4.mostrarCachorro2();
	}
}
