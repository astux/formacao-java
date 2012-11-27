package intermediario.revisao;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteChat {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		new ClienteChat("127.0.0.1", 12345).executa();
	}

	private String host;
	private int porta;

	public ClienteChat(String host, int porta) {
		this.host = host;
		this.porta = porta;
	}

	public void executa() throws UnknownHostException, IOException {
		Socket cliente = new Socket(this.host, this.porta);
		System.out.println("O cliente se conectou ao servidor!");
		// thread para receber mensagens do servidor
		Recebedor r = new Recebedor(cliente.getInputStream());
		new Thread(r).start();

		// le msgs do teclado e manda pro servidor
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		while (teclado.hasNextLine()) {
			saida.println(teclado.nextLine());
		}

		saida.close();
		teclado.close();
		cliente.close();

	}

	class Recebedor implements Runnable {

		private InputStream servidor;

		public Recebedor(InputStream servidor) {
			this.servidor = servidor;
		}

		public void run() {
			// recebe msgs do servidor e imprime na tela
			Scanner s = new Scanner(this.servidor);

			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
		}

	}
}