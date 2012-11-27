package intermediario.revisao;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contador {
	
	public Map<String, Integer> contar(InputStream in){
		Map<String, Integer> contador = new HashMap<>();
		Scanner scanner = new Scanner(in);
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine().trim();
			String[] palavras = linha.split(" ");
			for (String palavra : palavras) {
				if(contador.containsKey(palavra.trim())){
					Integer total = contador.get(palavra.trim());
					contador.put(palavra.trim(), total + 1);
				}else{
					contador.put(palavra.trim(), 1);
				}
			}
		}
		scanner.close();
		return contador;
	}
	
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(4444);
		Socket socket = server.accept();
		
		Map palavras = new Contador().contar(socket.getInputStream());
		System.out.println(palavras);
		socket.close();
	}
}
