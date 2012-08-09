package basico.introducao;

import java.util.Scanner;

public class Calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1 - Soma\n2 - Subtração");
		System.out.println("3 - Multiplicação\n4 - Divisão");
		int op = scanner.nextInt();
		
		System.out.println("Entre com os números");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int result = operacao(op, x, y);
		System.out.printf("Resultado é %d", result);
	}

	public static int soma(int x, int y) {
		return x + y;
	}

	public static int subtracao(int x, int y) {
		return x - y;
	}

	public static int multiplicacao(int x, int y) {
		return x * y;
	}

	public static int divisao(int x, int y) {
		return x / y;
	}

	public static int operacao(int op, int x, int y) {
		if (op == 1)
			return soma(x, y);
		else if (op == 2)
			return subtracao(x, y);
		else if (op == 3)
			return multiplicacao(x, y);
		else
			return divisao(x, y);
	}

}
