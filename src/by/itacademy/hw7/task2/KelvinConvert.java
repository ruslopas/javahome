package by.itacademy.hw7.task2;

public class KelvinConvert implements Converter {

	private double celsius;

	public KelvinConvert(double celsius) {
		this.celsius = celsius;
	}

	@Override
	public double convertFromCelsius() {
		return celsius + 273.15;
	}
}