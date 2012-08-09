package basico.fluxos;

public class Exemplo2 {

	public static void tabelaVerdadeAnd() {
		System.out.printf("Se %b AND %b => %b", true, true, true && true);
		System.out.printf("Se %b AND %b => %b", true, false, true && false);
		System.out.printf("Se %b AND %b => %b", false, true, false && true);
		System.out.printf("Se %b AND %b => %b", false, false, false && false);
	}

	public static void tabelaVerdadeOr() {
		System.out.printf("Se %b OR %b => %b", true, true, true || true);
		System.out.printf("Se %b OR %b => %b", true, false, true || false);
		System.out.printf("Se %b OR %b => %b", false, true, false || true);
		System.out.printf("Se %b OR %b => %b", false, false, false || false);
	}

	public static void exercicioIf() {
		// Imprimir "Entrada paga" se idade for maior que 18
		// Imprimir "Entrada franca" se idade for maior que 60
		// Imprimir "Entrada não permitida" se idade for maior que 60

		int idade = 23;

		// código que verifica a idade e imprime condição
	}

	public static void exemploSwitch() {
		int numero = 1;

		switch (numero) {
		case 1:
			System.out.println("Número Um");
			break;
		case 2:
			System.out.println("Número Dois");
			break;
		case 3:
			System.out.println("Número Três");
			break;
		default:
			System.out.println("Outro Número");
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
		case 'b':
		case 'B':
			System.out.println("Vogal B");
			break;
		case 'c':
		case 'C':
			System.out.println("Vogal C");
			break;
		default:
			System.out.println("Outra letra");
			break;
		}
	}

}
