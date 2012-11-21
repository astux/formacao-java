package intermediario.webserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class ProcessarRequisicao {

	public abstract void processa(InputStream inputStream, OutputStream outputStream) throws IOException;

	protected String cabecalho(String contentType) {
		String pagina = "HTTP/1.1 200 OK\n";
		pagina += String.format("Content-Type: %s\n\n", contentType);
		return pagina;
	}
	
	protected String cabecalho(){
		return cabecalho("text/html");
	}

	protected String inputStreamToString(InputStream is) throws IOException {
		byte[] bytes = new byte[is.available()];
		is.read(bytes);
		return new String(bytes);
	}
}
