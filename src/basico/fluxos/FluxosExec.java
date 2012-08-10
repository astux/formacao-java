package basico.fluxos;

public class FluxosExec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Exercicios.primos();
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …
		int n = 5;
		int primeiro = 0;
		int incremento = 1;

		for (int i = 0; i < n; i++) {
			if (i != 0) {
				int aux = primeiro + incremento;
				primeiro = incremento;
				incremento = aux;
			}
			System.out.println(primeiro);
		}
	}

}
