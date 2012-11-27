package intermediario.revisao;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServidorChat {
	public static void main(String[] args) throws IOException {
		new ServidorChat(12345).executa();
	}

	private int porta;
	private List<PrintStream> clientes;

	public ServidorChat(int porta) {
		this.porta = porta;
		this.clientes = new ArrayList<PrintStream>();
	}

	public void executa() throws IOException {
		ServerSocket servidor = new ServerSocket(this.porta);
		System.out.println("Porta 12345 aberta!");

		while (true) {
			// aceita um cliente
			Socket cliente = servidor.accept();
			System.out.println("Nova conexão com o cliente "
					+ cliente.getInetAddress().getHostAddress());

			// adiciona saida do cliente à lista
			PrintStream ps = new PrintStream(cliente.getOutputStream());
			this.clientes.add(ps);

			// cria tratador de cliente numa nova thread
			TrataCliente tc = new TrataCliente(cliente.getInputStream(), this);
			new Thread(tc).start();
		}
	}

	public void distribuiMensagem(String message) {
		for(PrintStream cliente : clientes){
			cliente.println(message);
		}
		
	}
}

class TrataCliente implements Runnable {

	private InputStream cliente;
	private ServidorChat servidor;

	public TrataCliente(InputStream cliente, ServidorChat servidor) {
		this.cliente = cliente;
		this.servidor = servidor;
	}

	public void run() {
		// quando chegar uma msg, distribui pra todos
		Scanner s = new Scanner(this.cliente);
		while (s.hasNextLine()) {
			servidor.distribuiMensagem(s.nextLine());
		}
		s.close();
	}
}
