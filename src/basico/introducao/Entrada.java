package basico.introducao;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		//cria Scanner para obter entrada de dados pelo terminal
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Primeiro número");
		//lê o número que o usuario forneceu no terminal 
		int numero1 = scanner.nextInt();
		
		System.out.println("Segundo número");
		//lê o número que o usuario forneceu no terminal 
		int numero2 = scanner.nextInt();
		
		int sum = numero1 + numero2;
		System.out.printf("Soma dos elementos é %d", sum);
	}

}
