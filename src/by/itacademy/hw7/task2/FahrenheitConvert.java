package by.itacademy.hw7.task2;

public class FahrenheitConvert implements Converter {

	private double celsius;

	public FahrenheitConvert(double celsius) {
		this.celsius = celsius;
	}

	@Override
	public double convertFromCelsius() {
		return (celsius * 1.8 + 32);
	}
}