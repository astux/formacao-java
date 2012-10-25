package intermediario.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class PersistirObjetos {

	public void salvar() throws IOException {
		File arquivo = new File("/tmp/data.db");
		arquivo.createNewFile();
		OutputStream fileOs = new FileOutputStream(arquivo);
		ObjectOutputStream os = new ObjectOutputStream(fileOs);
		
		os.writeUTF("Uma frase qualquer");
		
		os.close();
	}
	
	public void recuperar() throws IOException {
		InputStream fileIs = new FileInputStream("/tmp/data.db");
		ObjectInputStream is = new ObjectInputStream(fileIs);
		
		Object objeto = is.readUTF();
		
		System.out.println(objeto);
	}
	
	public static void main(String[] args) throws IOException {
		new PersistirObjetos().recuperar();
	}
}
