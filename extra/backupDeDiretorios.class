package cap15.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Cap15_Lab2 {

	static final String PASTA_ORIGEM = new String(
			//seu diretório que irá ser a origem do bkp
			"\\src\\cap15\\documentos2");
			
	static final String PASTA_BACKUP = new String(
	    //destino do seu bkp  
			"\\src\\cap15\\backup");

	public static void main(String[] args) {
  
  // crie variáveis do tipo Path com o destino e a origem como valores...
  
		Path origem = Paths.get(PASTA_ORIGEM);
		Path backup = Paths.get(PASTA_BACKUP);
    
    //Utilizando try/catch
		try {
      
      //crie uma condição para saber se a pasta do bkp já existe...
			if (Files.exists(backup)) {
				System.out.println("Diretório: " + backup.getFileName() + "diretório já existe.");
				
				//caso não haja a pasta destino o próximo algoritmo criará...
			} else {
				Files.createDirectory(backup);
				System.out.println("Diretório: " +backup.getFileName() + "diretório criado com sucesso." );
			}
			
			// neste passo estamos criando uma relação de todos os arquivos contidos na pasta origem
			Stream<Path> streamOrigem = Files.list(origem);
			
			//estamos aplicando uma ação para cada item encontrado na pasta
			streamOrigem.forEach(p -> {
				
				//neste algoritmo passamos para o console os arquivos que foram copiados
				try {
					System.out.println("Copiando arquivo " + p.getFileName());
					//e aqui copiamos os arquivos 
					Files.copy(p, backup.resolve(p.getFileName()));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			});
			
			
			
		} catch (IOException ioe) {
				ioe.printStackTrace();
		}
	}
}
