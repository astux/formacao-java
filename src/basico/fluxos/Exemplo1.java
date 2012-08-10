package basico.fluxos;

public class Exemplo1 {

	public static void casting() {
		int a = 3;
		System.out.printf("Valor de a é: %d\n", a);

		double b = 3.14;
		System.out.printf("Valor de b é: %f\n", b);

		int c = (int) 3.14;
		System.out.printf("Valor de c é: %d\n", c);

		double d = c;
		System.out.printf("Valor de d é: %f\n", d);
		System.out.printf("c e d são iguais? %b\n", c == d);
		
		char e = 116;
		System.out.printf("Valor de e é: %c\n", e);
	}

	public static void verificarIdade() {
		boolean menorDeIdade = true;
		int idade = 33;
		menorDeIdade = idade < 18;

		System.out.printf("É %b que sou menor de idade!\n", menorDeIdade);
	}

	public static void variacaoPrimitivos() {
		System.out.printf("Valores do boolean variam entre [%b, %b]\n",
				Boolean.FALSE, Boolean.TRUE);
		System.out.printf("Valores do byte variam entre [%d, %d]\n",
				Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("Valores do short variam entre [%d, %d]\n",
				Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("Valores do chart variam entre [%d, %d]\n",
				(int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		System.out.printf("Valores do int variam entre [%d, %d]\n",
				Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("Valores do long variam entre [%d, %d]\n",
				Long.MIN_VALUE, Long.MAX_VALUE);
		System.out.printf("Valores do float variam entre [%f, %f]\n",
				Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf("Valores do float variam entre [%f, %f]\n",
				Double.MIN_VALUE, Double.MAX_VALUE);
	}

	public static void numeroDoChar() {
		// Descobrir o numero (codigo) de um determinado char
		System.out.printf("Codigo e: %d\n", (int) 'a');
	}
}
