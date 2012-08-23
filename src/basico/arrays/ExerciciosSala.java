package basico.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import basico.orientacaoobj.Carta;

public class ExerciciosSala {

	static Carta[] montarBaralho() {
		String[] naipes = new String[] { "Copas", "Espada", "Ouros", "Paus" };
		int[] valores = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		Carta[] baralho = new Carta[naipes.length * valores.length];
		int numeroCarta = 0;

		for (int i = 0; i < naipes.length; i++) {
			for (int j = 0; j < valores.length; j++) {
				Carta carta = new Carta(valores[j], naipes[i]);
				baralho[numeroCarta] = carta;
				numeroCarta++;
			}
		}
		return baralho;
	}

	static void blackJack() {
		Carta[] cartas = montarBaralho();
		Scanner scan = new Scanner(System.in);
		char resp = 'S';
		int soma = 0;
		Random rand = new Random();
		while (true) {
			System.out.println("Proxima carta? [S/N]");
			resp = scan.next().charAt(0);
			if (resp == 'N') {
				break;
			}
			int idx = rand.nextInt(cartas.length);
			soma += cartas[idx].getValor();
			System.out.printf("Sua carta foi %s\n", cartas[idx]);
			if (soma > 21) {
				System.out.println("Voce Perdeu!!");
				break;
			}
		}
		System.out.printf("Voce somou %d pontos", soma);
		scan.close();
	}

	static void matriz() {
		int dim = 3;
		int[][] matriz = new int[dim][dim];
		
		//preencher matriz
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				matriz[i][j] = i*j;
			}
		}
		//imprimir matriz
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));	
		}
		
	}
}
