package by.itacademy.hw7.task2;

public class ConvertFromCelcius {
	// Fields
	private double celsius;

	// Constuctor
	public ConvertFromCelcius(double celsius) {
		this.celsius = celsius;
	}

	// Methods
	public double getFahrenheit() {
		return (celsius * 1.8 + 32);
	}

	public double getKelvins() {
		return celsius + 273.15;
	}

	public String getConvertionInfo() {
		return "Fahrenheit degrees : " + String.format("%.2f", getFahrenheit()) + "F\n" + "Kelvin degrees : "
				+ String.format("%.2f", getKelvins()) + "K";

	}
}
