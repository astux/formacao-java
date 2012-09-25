package intermediario.interfaces.trajetos;

import intermediario.interfaces.trajetos.impl.ExibirGrafico;

public class Trajetos {

	private ExibirTrajetorias exibirTrajetorias;

	public void setExibirTrajetorias(ExibirTrajetorias exibirTrajetorias) {
		this.exibirTrajetorias = exibirTrajetorias;
	}

	public void mostrar() {
		Trajetoria[] trajetorias = new Trajetoria[] { new Trajetoria(100, 30),
				new Trajetoria(100, 45), new Trajetoria(100, 60) };

		exibirTrajetorias.exibir(trajetorias);
	}

	public static void main(String[] args) {
		Trajetos traj = new Trajetos();
		traj.setExibirTrajetorias(new ExibirGrafico());
		traj.mostrar();
	}

}
