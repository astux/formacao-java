package basico.fluxos;

import java.util.Scanner;

public class Exemplo3 {

	public static void exemploWhile() {
		int contador; // Declara variável de controle
		contador = 1; // Inicializa variável de controle
		while (contador <= 4) { // Testa a expressão
			// Repete instruções
			System.out.printf("Contador = %d\n", contador);
			contador++; // Atualiza variável de controle
		}
		System.out.println("Terminado");
	}

	public static void exemploDoWhile() {
		Scanner scan = new Scanner(System.in);
		char aux = '0';
		int contador = 0;
		do {
			System.out.println("Contador = " + contador);
			System.out.print("Digite uma letra e ENTER: ");
			aux = scan.next().charAt(0);
			contador++;
		} while (aux != 'Q');// Criterio de Parada
		System.out.printf("Número de iterações: %d\n", contador);
	}

	public static void exemploFor() {
		int numero = 20;
		for (int i = 0; i < numero; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d é um número par.", i);
			} else {
				System.out.printf("%d é um número impar.", i);
			}
		}
	}
	
	public static void exercicioLoop(){
		//Verificar se determinado número é um número primo
		int numero = 11;
		
		//Código que verifica se um número é primo
	}
}
