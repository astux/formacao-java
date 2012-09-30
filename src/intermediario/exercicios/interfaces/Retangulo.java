package intermediario.exercicios.interfaces;

public class Retangulo implements FiguraGeometrica {

	double base;
	double altura;

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public double perimetro() {
		return 2 * (base + altura);
	}

}
