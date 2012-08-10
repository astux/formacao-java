package basico.fluxos;

import java.util.Scanner;

public class Exemplo3 {

	public static void exemploWhile() {
		int contador; // Declara variavel de controle
		contador = 1; // Inicializa variavel de controle
		while (contador <= 4) { // Testa a expressao
			// Repete instrucoes
			System.out.printf("Contador = %d\n", contador);
			contador++; // Atualiza variavel de controle
		}
		System.out.println("Terminado");
	}

	public static void exemploDoWhile() {
		Scanner scan = new Scanner(System.in);
		char aux = '0';
		int contador = 0;
		do {
			System.out.print("Digite uma letra e ENTER: ");
			aux = scan.next().charAt(0);
			contador++;
		} while (aux != 'Q');// Criterio de Parada
		System.out.printf("Numero de iteracoes: %d\n", contador);
	}

	public static void exemploFor() {
		int numero = 20;
		for (int i = 0; i < numero; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d é um numero par.\n", i);
			} else {
				System.out.printf("%d é um numero impar.\n", i);
			}
		}
	}
	
}
