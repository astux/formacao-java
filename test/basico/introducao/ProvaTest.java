package basico.introducao;

import static org.junit.Assert.*;

import org.junit.Test;

import basico.introducao.Prova;

public class ProvaTest {

	@Test
	public void testReverterPalavra() {
		Prova prova = new Prova();
		assertEquals("ogaiht", prova.reverterPalavra("thiago"));
	}

}
