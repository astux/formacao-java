package basico.introducao;

import java.util.Scanner;

public class Comparacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com os números");
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();

		if (numero1 == numero2)
			System.out.printf("%d e %d são iguais\n", numero1, numero2);
		if (numero1 != numero2)
			System.out.printf("%d e %d são diferentes\n", numero1, numero2);
		if (numero1 > numero2)
			System.out.printf("%d é maior que %d\n", numero1, numero2);
		if (numero1 <= numero2)
			System.out.printf("%d é menor igual a %d\n", numero1, numero2);
	}

}
