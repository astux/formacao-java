/**
 * 
 */
package intermediario.interfaces.trajetos.impl;

import intermediario.interfaces.trajetos.ExibirTrajetorias;
import intermediario.interfaces.trajetos.Trajetoria;

/**
 * @author thiago
 * 
 */
public class ExibirGrafico implements ExibirTrajetorias {

	@Override
	public void exibir(Trajetoria[] trajetorias) {
		/*XYSeriesCollection dataset = preencherDados(trajetorias);

		JFreeChart chart = ChartFactory.createXYLineChart("Trajetoria",
				"Distancia", "Altura", dataset, PlotOrientation.VERTICAL, true,
				true, false);
		
		montarFrame(chart);*/
	}

	/*private XYSeriesCollection preencherDados(Trajetoria[] trajetorias) {
		XYSeriesCollection dataset = new XYSeriesCollection();
		for (int i = 0; i < trajetorias.length; i++) {
			double[][] rotas = trajetorias[i].rota();
			XYSeries serie = new XYSeries("Trajetoria "
					+ trajetorias[i].getTeta(), false, false);
			for (int j = 0; j < rotas.length; j++) {
				serie.add(rotas[j][0], rotas[j][1]);
			}
			dataset.addSeries(serie);
		}
		return dataset;
	}

	private void montarFrame(JFreeChart chart) {
		JFrame frame = new JFrame("Trajetos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new ChartPanel(chart));
		frame.pack();
		frame.setVisible(true);
	}*/

}
