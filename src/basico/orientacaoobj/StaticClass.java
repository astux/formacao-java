package basico.orientacaoobj;

public class StaticClass {
	public static int contadorStatic = 0;

	// Variavel nao-static
	public int contador = 0;

	public StaticClass() {
	}

	// Precisa ser static porque "contador" é static
	public static void incrementaContador() {
		contadorStatic++;
		System.out.printf("contadorStatic agora é %d\n", contadorStatic);
	}

	public void incrementaOutroContador() {
		contador++;
		System.out.printf("contador agora é %d\n", contador);
	}
}
