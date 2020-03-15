package euroDolar;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class EuroDolarTest {

	EuroDolar dinero;

	@Parameters
	public static Iterable<Object[]> getData() {
		return Arrays.asList(new Object[][] { { 11.64, 9.47, 10.5 }, { 22.51, 18.31, 20.30 } });
	}

	private double dolar, euro, exp;

	public EuroDolarTest(double dolar, double euro, double exp) {
		this.dolar = dolar;
		this.euro = euro;
		this.exp = exp;
	}

	@Before
	public void before() {
		dinero = new EuroDolar();
	}

	@Test
	public void testDollar2euro() {
		double result = dinero.dollar2euro(dolar);
		assertEquals(exp, result, 0.3);
	}

	@Test
	public void testEuro2dollar() {
		double result = dinero.euro2dollar(euro);
		assertEquals(exp, result, 0.3);
	}

}
