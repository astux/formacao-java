package basico.exercicios;

import java.util.Arrays;

public class Ordenacao {

	static void order(int[] array) {
		// Dever de casa
	}

	static void swap(int[] array, int i, int j) {
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 5, 3, 1, 2, 0, 4 };
		order(array);
		System.out.println(Arrays.toString(array));
		//usando o metodo swap, ordene o array para que
		//saida dessa execucao deve ser [0, 1, 2, 3, 4, 5]
		//ps. o metodo deve ordenar as elementos de forma 
		//qualquer array desordenado seja reordenado corretamente
	}

}
