package intermediario.sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleServer {
	
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(4444);

		Socket cliente = servidor.accept();

		System.out.println("Nova conexão com o cliente "
				+ cliente.getInetAddress().getHostAddress());

		Scanner scan = new Scanner(cliente.getInputStream());
		
		while(scan.hasNextLine()){
			String mensagem = scan.nextLine();
			if("exit".equals(mensagem)){
				break;
			}
			PrintStream saida = new PrintStream(System.out);//cliente.getOutputStream()
			saida.println(mensagem);
		}
		
		scan.close();
		cliente.close();
		servidor.close();
	}
	
}
