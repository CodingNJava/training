package cap4.lab;

public class Lab3 {
public static void main(String[] args) {
	
	for (int ano = 1930; ano < 2016; ano += 4) {
		if (ano == 1942){
			continue;
		} else if (ano == 1946){
			continue;
		}
		System.out.println("Anos que ocorreram copas do Mundo " + ano);
	}
}
}
