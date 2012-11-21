package intermediario.webserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {

	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(8080);

		while (true) {
			new Thread(new Requisicao(servidor.accept())).start();
		}
	}

}

class Requisicao implements Runnable {
	private Socket socket;
	private ProcessarRequisicao requisicao;

	public Requisicao(Socket socket) {
		this.socket = socket;
		//requisicao = new EnviarArquivo("c:/algum-arquivo.txt");
		requisicao = new ResgatarBanco();
		
	}

	@Override
	public void run() {
		try {
			requisicao.processa(socket.getInputStream(),
					socket.getOutputStream());
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

	}

}
