package euroDolar;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EuroDolarTestSinParametrizar {

	EuroDolar money;

	@Before
	public void before() {
		money = new EuroDolar();
	}

	@Test
	public void testdollar2euro() {
		double resultado = money.dollar2euro(5);
		double esperado = 4.5;
		assertEquals(esperado, resultado, 0.2);
	}

	@Test
	public void testeuro2dollar() {
		double resultado = money.euro2dollar(6);
		double esperado = 6.6;
		assertEquals(esperado, resultado, 0.2);
	}

}
