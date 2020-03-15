package euroDolar;

public class EuroDolar {

	// Métodos creados teniendo en cuenta que a 31/01/2020 el dolar estaba a 0.9
	// euros.
	public double dollar2euro(double dolar) {
		double euro = dolar * 0.90;
		return euro;
	}

	public double euro2dollar(double euro) {
		double dolar = euro / 0.9;
		return dolar;
	}
}
