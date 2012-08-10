package basico.fluxos;

public class Exemplo2 {

	public static void tabelaVerdadeAnd() {
		System.out.printf("Se %b AND %b => %b\n", true, true, true && true);
		System.out.printf("Se %b AND %b => %b\n", true, false, true && false);
		System.out.printf("Se %b AND %b => %b\n", false, true, false && true);
		System.out.printf("Se %b AND %b => %b\n", false, false, false && false);
	}

	public static void tabelaVerdadeOr() {
		System.out.printf("Se %b OR %b => %b\n", true, true, true || true);
		System.out.printf("Se %b OR %b => %b\n", true, false, true || false);
		System.out.printf("Se %b OR %b => %b\n", false, true, false || true);
		System.out.printf("Se %b OR %b => %b\n", false, false, false || false);
	}

	public static void exercicioIf() {
		// Imprimir "Entrada paga" se idade for maior que 18
		// Imprimir "Entrada franca" se idade for maior que 60
		// Imprimir "Entrada nao permitida" se idade for menor que 18

		int idade = 23;

		if (idade >= 18 && idade < 60) {
			System.out.println("Entrada paga");
		} else if (idade >= 60) {
			System.out.println("Entrada franca");
		} else {
			System.out.println("Entrada nao permitida");
		}
	}

	public static void exemploSwitch() {
		int numero = 1;

		switch (numero) {
		case 1:
			System.out.println("Numero Um");
			break;
		case 2:
			System.out.println("Numero Dois");
			break;
		case 3:
			System.out.println("Numero Tres");
			break;
		default:
			System.out.println("Outro Numero");
			break;
		}
	}

	public static void exemploSwitch2() {
		char vogal = 'a';

		switch (vogal) {
		case 'a':
		case 'A':
			System.out.println("Vogal A");
			break;
		case 'e':
		case 'E':
			System.out.println("Vogal E");
			break;
		case 'i':
		case 'I':
			System.out.println("Vogal I");
			break;
		default:
			System.out.println("Outra letra");
			break;
		}
	}

}
