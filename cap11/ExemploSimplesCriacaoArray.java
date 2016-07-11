package cap11;

public class ExemploSimplesCriacaoArray {
	public static void main(String[] args) {

		// array codigo
		int codigo[] = new int[5];
		
		codigo[0] = 1;
		codigo[1] = 2;
		codigo[2] = 3;
		codigo[3] = 4;
		codigo[4] = 5;
		
		for (int i = 0; i < codigo.length; i++) {
			System.out.println(codigo[i]);
		}

		

		// array nome
		String nome[] = new String[5];
		
		nome[0] = "Ana";
		nome[1] = "Bete";
		nome[2] = "Cida";
		nome[3] = "João";
		nome[4] = "Pedro";
		
		
		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i] + " ");
		}

		

			
	}

}
