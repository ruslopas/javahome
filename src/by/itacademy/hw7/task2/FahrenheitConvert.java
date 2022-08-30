package by.itacademy.hw7.task2;

public class FahrenheitConvert implements Converter {

	public FahrenheitConvert(double celsiusDegree) {
	}

	@Override
	public double convertFromCelsius(double celsiusDegree) {
		return celsiusDegree * 1.8 + 32;
	}
}