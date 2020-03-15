package celsiusFarhenheit;

public class CambioTemp {

	public double fahrenheitCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}

	public double celsiusFahrenheit(double celsius) {
		double farenheit = (celsius * 9 / 5) + 32;
		return farenheit;
	}

}
