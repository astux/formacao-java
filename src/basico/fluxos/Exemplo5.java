package basico.fluxos;

public class Exemplo5 {

	public static void exemploBreak() {
		int numero = 20;
		for (int i = 0; i < numero; i++) {
			if (numero >= numero / 2) {
				break;
			} else {
				System.out.printf("Número: %d", i);
			}
		}
	}

	public static void exemploContinue() {
		int numero = 10;
		for (int i = 0; i < numero; i++) {
			if (numero % 2 == 0) {
				continue;
			}
			System.out.printf("Número: %d", i);
		}
	}
}
