package basico.introducao;

import java.util.Arrays;

public class Prova {

	public String reverterPalavra(String palavra) {
		String resultado = "";
		for (int i = palavra.length() - 1; i >= 0; i--) {
			resultado += palavra.charAt(i);
		}
		return resultado;
	}

}
