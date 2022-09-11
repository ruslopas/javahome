package by.itacademy.hw9.task3;

public abstract class Vehicle {

	private String manufacturer;

	private String type;

	public Vehicle(String manufacturer, String type) {
		this.manufacturer = manufacturer;
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getType() {
		return type;
	}

}
