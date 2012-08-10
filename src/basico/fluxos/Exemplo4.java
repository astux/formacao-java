package basico.fluxos;

public class Exemplo4 {

	public static void exemploBreak() {
		int numero = 20;
		for (int i = 0; i < numero; i++) {
			if (i >= numero / 2) {
				break;
			} else {
				System.out.printf("Numero: %d\n", i);
			}
		}
	}

	public static void exemploContinue() {
		int numero = 10;
		for (int i = 0; i < numero; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.printf("Numero: %d\n", i);
		}
	}
}
