package extra;

public class UsandoVarargs {
	public static void main(String[] args) {
        System.out.println("Resultado: " + somar(2,3));
        System.out.println("Resultado: " + somar(2,3,4));
        System.out.println("Resultado: " + somar(2,3,4,6));
    }

    public static int somar(int ... inteiros){
        int resultado = 0;
        for (int i = 0; i<inteiros.length; i++) {
            resultado += inteiros[i];
        }
        return resultado;
    }

}

/*
 * Sintaxe mais simples para passar
 * conjuntos de parâmetros do mesmo tipo
 * Evita a criação de arrays manualmente
 * As declarações de tamanho variado 
 * são sempre seguidas de ...
 * Devem ser sempre o último parâmetro

*/

