package intermediario.webserver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class EnviarArquivo extends ProcessarRequisicao {

	final private String file;
	
	public EnviarArquivo(String file) {
		this.file = file;
	}
	@Override
	public void processa(InputStream inputStream, OutputStream outputStream)
			throws IOException {
		Scanner scan = new Scanner(new File(file));
		PrintStream writer = new PrintStream(outputStream);
		writer.println(cabecalho("text/plain"));
		while(scan.hasNextLine()){
			writer.println(scan.nextLine());
		}
		
		scan.close();
	}

}
