package intermediario.sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleWebServer {

	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(8080);

		while (true) {
			Socket cliente = servidor.accept();

			String pagina = "HTTP/1.1 200 OK\n";
			pagina += "Content-Type: text/html\n\n";
			pagina += "<html><title>Primeira Pagina</title><body>";
			pagina += "<h1>Uau, essa eh minha pagina</h1></body></html>";

			PrintStream saida = new PrintStream(cliente.getOutputStream());
			saida.println(pagina);

			cliente.close();
		}
	}

}
