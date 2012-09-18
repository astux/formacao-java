package intermediario.excecoes;

public class ExemploExcecao {

	public static void main(String[] args) {
		System.out.printf("Velocidade media e: %d km/h\n", velocidade(10, 5));

		int[] valores = { 10, 11, 12, 13 };
		imprimirCincoPrimeiros(valores);
	}

	static int velocidade(int espaco, int tempo) {
		return espaco / tempo;
	}

	static void imprimirCincoPrimeiros(int[] numeros) {
		for (int i = 0; i < 5; i++) {
			System.out.println(numeros[i]);
		}
	}

}
