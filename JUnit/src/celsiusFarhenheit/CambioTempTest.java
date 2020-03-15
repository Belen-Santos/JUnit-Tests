package celsiusFarhenheit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CambioTempTest {

	CambioTemp temp;

	@Parameters
	public static Iterable<Object[]> getData() {
		return Arrays.asList(new Object[][] { { -20.5, 23, -5 }, { -17.7, 32, 0 }, { -9.4, 59, 15 }, { 0, 89.6, 32 } });
	}

	private double celsius, fahrenheit, exp;

	public CambioTempTest(double celsius, double fahrenheit, double exp) {
		this.celsius = celsius;
		this.fahrenheit = fahrenheit;
		this.exp = exp;
	}

	@Before
	public void before() {
		temp = new CambioTemp();
	}

	@Test
	public void testFahrenheitCelsius() {
		double result = temp.fahrenheitCelsius(fahrenheit);
		assertEquals(exp, result, 0.8);
	}

	@Test
	public void testCelsiusFahrenheit() {
		double result = temp.celsiusFahrenheit(celsius);
		assertEquals(exp, result, 0.8);
	}

}
