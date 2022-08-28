package by.itacademy.hw8.task3;

public abstract class Product {

	private String color;
	private String manufacturer;
	private double price;

	public Product(String color, String manufacturer, double price) {
		this.color = color;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

}
