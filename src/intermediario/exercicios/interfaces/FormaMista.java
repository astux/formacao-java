package intermediario.exercicios.interfaces;

public class FormaMista {
	FiguraGeometrica[] formas;

	public FormaMista(FiguraGeometrica[] formas) {
		this.formas = formas;
	}
	
	double area() {
		double somaArea = 0;
		for (FiguraGeometrica forma : formas) {
			somaArea += forma.area();
		}
		return somaArea;
	}
	
	public static void main(String[] args) {
		FormaMista forma = new FormaMista(new FiguraGeometrica[] {
				new Retangulo(30, 10),
				new Retangulo(20, 40),
				new Retangulo(5, 5),
				new TrianguloRetangulo(20, 10)
			});
		System.out.println("Area é: " + forma.area());
	}
}
