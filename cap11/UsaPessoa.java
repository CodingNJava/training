package cap11;

public class UsaPessoa {
	public static void main(String[] args) {

		Pessoa pessoas[] = new Pessoa[2]; // declara a array pessoa

		pessoas[0] = new Pessoa(); // cria a instancia para a posição ZERO
		pessoas[0].setNome("Maria");
		pessoas[0].setPeso(55);
		pessoas[0].setAltura(1.68);

		pessoas[1] = new Pessoa(); // cria a instancia para a posição ZERO
		pessoas[1].setNome("José");
		pessoas[1].setPeso(60);
		pessoas[1].setAltura(1.77);

		//for (int i = 0; i < pessoas.length; i++) {
			//pessoas[i].mostrarDados();
		//}
		
		for(Pessoa p:pessoas){
			System.out.println(p);
		}
	}
}
