package basico.arrays;

import java.util.Arrays;

public class Exemplo1 {
	static void criandoArrays() {
		int[] idades = new int[10];
		System.out.println(Arrays.toString(idades));
	}

	static void iniciandoValoresDiretamente() {
		int[] idades = new int[] { 3, 4, 5 };
		for (int i = 0; i < 3; i++) {
			System.out.println(idades[i]);
		}
	}

	static void usandoLength() {
		int[] idades = new int[] { 3, 4, 5 };
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}
}
