package intermediario.arquivos;

import java.io.File;
import java.io.IOException;

public class ExemploFile {

	void criarArquivo() throws IOException {
		File arquivo = new File("C:\\Exercicios\\meuArquivo.txt");
		System.out.println(arquivo.exists());
		arquivo.createNewFile();
		System.out.println(arquivo.exists());
		arquivo.delete();
	}
	
	void listar(){
		File raiz = new File("C:\\Exercicios");

		for (String elem : raiz.list()) {
			if(elem.contains("qui")){
				System.out.println(elem);
			}else{
				new File("C:\\Exercicios\\"+elem).delete();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		ExemploFile ex = new ExemploFile();
		ex.listar();
	}
}
