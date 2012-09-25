package intermediario.interfaces.trajetos.impl;

import java.util.Arrays;

import intermediario.interfaces.trajetos.ExibirTrajetorias;
import intermediario.interfaces.trajetos.Trajetoria;

public class ExibirConsole implements ExibirTrajetorias {

	@Override
	public void exibir(Trajetoria[] trajetorias) {
		for (int i = 0; i < trajetorias.length; i++) {
			System.out.println("Trajetoria "+i+" foi de:");
			double[][] rotas = trajetorias[i].rota();
			for (int j = 0; j < rotas.length; j++) {
				System.out.println(Arrays.toString(rotas[j]));
			}
		}
	}

}
