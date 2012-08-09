package basico.introducao;

import static org.junit.Assert.*;

import org.junit.Test;

import basico.introducao.Calculadora;

public class CalculadoraTest {

	@Test
	public void testSoma() {
		assertEquals(8, Calculadora.soma(4, 4));
	}

	@Test
	public void testSubtracao() {
		assertEquals(0, Calculadora.subtracao(4, 4));
	}

	@Test
	public void testMultiplicacao() {
		assertEquals(16, Calculadora.multiplicacao(4, 4));
	}

	@Test
	public void testDivisao() {
		assertEquals(2, Calculadora.divisao(4, 2));
	}

}
