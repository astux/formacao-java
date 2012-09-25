package intermediario.interfaces.trajetos;

public class Trajetoria {
	private double g = 9.8;
	private double vo = 0.0;
	private double teta = 0.0;

	public Trajetoria(double vo, double teta) {
		this.vo = vo;
		this.teta = teta;
	}

	public Trajetoria(double g, double vo, double teta) {
		this(vo, teta);
		this.g = g;
	}

	public double getTeta() {
		return teta;
	}

	double maxDist() {
		double ang = Math.toRadians(teta);
		return (2 * (Math.pow(vo, 2)) / g) * Math.sin(ang) * Math.cos(ang);
	}

	double altPorDist(double d) {
		double ang = Math.toRadians(teta);
		double t = d / (vo * Math.cos(ang));
		return vo * Math.sin(ang) * t - g * (Math.pow(t, 2)) / 2;
	}

	public double[][] rota() {
		double max = maxDist();
		double[][] valores = new double[((int) max + 1)][2];
		for (int i = 0; i < (int) max; i++) {
			valores[i] = new double[] { i, altPorDist(i) };
		}
		valores[(int) max] = new double[] { max, altPorDist(max) };
		return valores;
	}
}
