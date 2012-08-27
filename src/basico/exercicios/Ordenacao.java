package basico.exercicios;

import java.util.Arrays;

public class Ordenacao {

	static void order(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if(array[j] < array[i]){
					swap(array, i, j);
				}
			}
		}
	}

	static void swap(int[] array, int i, int j) {
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 4, 20, 8, 12, 10, 14, 6, 2, 18, 16 };
		order(array);
		System.out.println(Arrays.toString(array));
		// usando o metodo swap, ordene o array para que
		// saida dessa execucao deve ser [0, 1, 2, 3, 4, 5]
		// ps. o metodo deve ordenar as elementos de forma
		// qualquer array desordenado seja reordenado corretamente
	}

}
