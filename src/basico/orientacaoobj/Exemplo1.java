package basico.orientacaoobj;

public class Exemplo1 {

	static void primos(int n) {
		// imprimir n primeiros os numeros primos
		// Nota.: Um numero primo e um numero que e divisivel somente por 1 e
		// por ele mesmo
		int contador = 0;
		String numeros = "";
		for (int i = 1; contador < n; i++) {
			// se i for primo incrementa o contador e imprime o valor
			if (ehPrimo(i)) {
				numeros += (contador < n - 1) ? i + ", " : i;
				contador++;
			}
		}
		System.out.println(numeros);
	}

	// verifica se i e primo
	static boolean ehPrimo(int numero) {
		boolean primo = true;
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0) {
				primo = false;
				break;
			}
		}
		return primo;
	}

}
