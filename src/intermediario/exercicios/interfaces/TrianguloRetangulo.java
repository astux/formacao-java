package intermediario.exercicios.interfaces;

public class TrianguloRetangulo implements FiguraGeometrica {

	double base;
	double altura;
	double hipotenusa;

	public TrianguloRetangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		//sqrt -> Square Root (Ingles de Raiz Quadrada)
		this.hipotenusa = Math.sqrt((altura * altura) + (base * base));
	}

	@Override
	public double area() {
		return base * altura / 2;
	}

	@Override
	public double perimetro() {
		return base + altura + hipotenusa;
	}

}
