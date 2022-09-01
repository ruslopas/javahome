package by.itacademy.hw7.task2;

public class KelvinConvert implements Converter {

	public KelvinConvert(double celsius) {
	}

	@Override
	public double convertFromCelsius(double celsiusDegree) {
		return celsiusDegree + 273.15;
	}
}