package basico.orientacaoobj;

public class Retangulo {
	double base;
	double altura;

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	double area() {
		return base * altura;
	}

	double perimetro() {
		return 2 * (base + altura);
	}

	public String toString() {
		return String.format("(%f, %f)", this.base, this.altura);
	}
}
